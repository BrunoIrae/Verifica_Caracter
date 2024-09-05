public class main {
    public static void main(String[] args) {

        String texto = "Estagio - Ribeirao Preto";
        verificar(texto);
    }

    public static void verificar(String texto) {
        int cont = 0;

        // Percorre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            // Verifica se o caractere é 'a' ou 'A'
            if (caractere == 'a' || caractere == 'A') {
                cont++;
            }
        }

        // Exibe o resultado
        if (cont > 0) {
            System.out.println("A letra 'a' aparece " + cont + " vez(es) no texto.");
        } else {
            System.out.println("A letra 'a' não aparece no texto.");
        }
    }
}