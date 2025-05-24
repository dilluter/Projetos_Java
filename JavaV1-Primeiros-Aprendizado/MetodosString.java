public class MetodosString {
    public static void main(String[] args) {
        String texto = "  Aprender Java é muito Legal!  ";
        String outroTexto = "aprender java é muito legal!";

        // length() → tamanho da string
        System.out.println("length: " + texto.length());

        // charAt() → caractere na posição 5
        System.out.println("charAt(5): " + texto.charAt(5));

        // toLowerCase() → tudo minúsculo
        System.out.println("toLowerCase: " + texto.toLowerCase());

        // toUpperCase() → tudo maiúsculo
        System.out.println("toUpperCase: " + texto.toUpperCase());

        // replace() → substitui "Java" por "Python"
        System.out.println("replace: " + texto.replace("Java", "Python"));

        // substring() → recorta do índice 10 ao 14
        System.out.println("substring(10, 14): " + texto.substring(10, 14));

        // indexOf() → posição da palavra "Legal"
        System.out.println("indexOf('Legal'): " + texto.indexOf("Legal"));

        // lastIndexOf() → última ocorrência da letra 'a'
        System.out.println("lastIndexOf('a'): " + texto.lastIndexOf("a"));

        // split() → divide em palavras
        String[] palavras = texto.trim().split(" ");
        System.out.println("split:");
        for (String palavra : palavras) {
            System.out.println("- " + palavra);
        }

        // equals() → compara se é igual (sensível a maiúsculas)
        System.out.println("equals: " + texto.equals(outroTexto));

        // equalsIgnoreCase() → compara ignorando maiúsculas/minúsculas
        System.out.println("equalsIgnoreCase: " + texto.trim().equalsIgnoreCase(outroTexto));

        // startsWith() → começa com "Aprender"?
        System.out.println("startsWith('Aprender'): " + texto.trim().startsWith("Aprender"));

        // endsWith() → termina com "Legal!"?
        System.out.println("endsWith('Legal!'): " + texto.trim().endsWith("Legal!"));

        // trim() → remove espaços no início e fim
        System.out.println("trim: '" + texto.trim() + "'");

        // contains() → contém "muito"?
        System.out.println("contains('muito'): " + texto.contains("muito"));

        // isEmpty() → verifica se a string está vazia
        String vazia = "";
        System.out.println("isEmpty (vazia): " + vazia.isEmpty());
    }
}
