public class Main {
    public static void main(String[] args) {
        int ano2023;
        ano2023 = 2023;
        System.out.println("Olá Mundo!");
        System.out.println(ano2023);
        int nascimento = 1989;
        boolean anoBissesto = false;

        String nome = "Alexssandro";
        String sobrenome = "Araújo Santos";
        String nomeCompleto;
        nomeCompleto = nomeCompleto(nome,sobrenome);
        System.out.println(nomeCompleto);


    }

    public static String nomeCompleto (String primeiroNome,String segundoNome){
//        return (primeiroNome + " " + segundoNome);
        return "Resultado: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}