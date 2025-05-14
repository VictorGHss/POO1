package utfpr.fundamentos.exercicios.lista05.sala;

public class SalaReuniaoTeste {
    public static void main(String[] args) {
        SalaReuniao sala = new SalaReuniao();

        // Reservar Salas
        sala.reservarSala("Beta", 7, 13);
        sala.reservarSala("Alpha", 6, 10);
        sala.reservarSala("Delta", 5, 11);

        // Tentar reservar sala quando estiverem todas ocupadas
        sala.reservarSala("Echo", 4, 15);

        // Encerrar Reunião
        sala.encerrarReuniao("Beta", 16);

        // Reservar salas
        sala.reservarSala("Gamma", 7, 17);

        // Encerrar reuniao de equipe que nao existe
        sala.encerrarReuniao("Charlie", 14);
    }
}
