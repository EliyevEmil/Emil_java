package lesson66;

public class Main {
    public static void main(String[] args) {
        String text = "  Java Programming  ";

        System.out.println("--- Java String Metodlarının Yoxlanışı --- \n");

        boolean bosluqdurmu = text.isBlank();
        System.out.println("1. Mətn yalnız boşluqlardan ibarətdir? -> " + bosluqdurmu);

        boolean tamBosdurmu = text.isEmpty();
        System.out.println("2. Mətn tamamilə boşdurmu (uzunluq = 0)? -> " + tamBosdurmu);

        boolean javaIleBaslayir = text.startsWith("Java");
        System.out.println("3. Mətn 'Java' ilə başlayır? -> " + javaIleBaslayir);

        boolean ingIleBitiyor = text.endsWith("ing");
        System.out.println("4. Mətn 'ing' ilə bitir? -> " + ingIleBitiyor);

        int proIndeksi = text.indexOf("Pro");
        System.out.println("5. 'Pro' sözünün başladığı indeks -> " + proIndeksi);

        boolean yalnizHerfVeBosluq = text.matches("[a-zA-Z\\s]+");
        System.out.println("6. Mətndə yalnız hərf və boşluq var? -> " + yalnizHerfVeBosluq);
    }
}