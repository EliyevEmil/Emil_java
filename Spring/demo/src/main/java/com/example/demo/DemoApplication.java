package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		CarService carService = context.getBean(CarService.class);
		carService.driveCar();
		carService.driveCar();

		context.close();
	}

	@Component
	@Scope("prototype")
	public static class Engine {

		public Engine() {
			System.out.println("LOG: 🚗 Təzə Engine yarandı!");
		}

		@PostConstruct
		public void init() {
			System.out.println("LOG: ⚙️ Engine hazırdır! (@PostConstruct)");
		}

		public void start() {
			System.out.println("LOG: 💨 Engine işləyir: vrrrm!");
		}

		@PreDestroy
		public void destroy() {
			System.out.println("LOG: ❌ Engine bağlandı! (@PreDestroy)");
		}
	}

	@Service
	@Scope("singleton")
	public static class CarService {

		@Autowired
		private ApplicationContext context;

		public CarService() {
			System.out.println("LOG: 🚘 CarService 1 dəfə yarandı! (singleton)");
		}

		@PostConstruct
		public void init() {
			System.out.println("LOG: ✅ CarService hazırdır! (@PostConstruct)");
		}

		public void driveCar() {
			System.out.println("--- Maşın sürülür ---");
			Engine engine = context.getBean(Engine.class);
			engine.start();
		}

		@PreDestroy
		public void destroy() {
			System.out.println("LOG: 🛑 CarService bağlandı! (@PreDestroy)");
		}
	}
}