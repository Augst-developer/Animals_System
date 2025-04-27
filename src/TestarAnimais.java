public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f, null);
        Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180.0f, 4, "Vermelho", "Terra", 0.5f, "Mel");

        System.out.println("--- Dados do Camelo ---");
        camelo.dadosMamifero();

        System.out.println("\n--- Dados do Tubarão ---");
        tubarao.dadosPeixe();

        System.out.println("\n--- Dados do Urso-do-Canadá ---");
        ursocanada.dadosMamifero();
    }
}
