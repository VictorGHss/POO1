package utfpr.fundamentos.exercicios.lista05.sala;

public class SalaReuniao {
    Equipe sala1 = null;
    Equipe sala2 = null;
    Equipe sala3 = null;

    public void reservarSala(String nome, int numMembros, int horaInicial){
        if(sala1 == null){
            sala1 = new Equipe(nome, numMembros, horaInicial);
            System.out.println("A equipe " + nome + " reservou a sala 1!");
        } else if (sala2 == null){
            sala2 = new Equipe(nome, numMembros, horaInicial);
            System.out.println("A equipe " + nome + " reservou a sala 2!");
        } else if (sala3 == null){
            sala3 = new Equipe(nome, numMembros, horaInicial);
            System.out.println("A equipe " + nome + " reservou a sala 3!");
        } else {
            System.out.println("Todas as salas estão ocupadas!");
        }
    }

    public double calcularCusto (int horaInicial, int horaSaida){
        int horasPermanencia = horaSaida - horaInicial;
        if(horasPermanencia < 1){
            return 50.00;
        } else {
            return 50.00 + (horasPermanencia * 10.00);
        }
    }

    public void encerrarReuniao(String nome, int horaSaida){
        boolean encontrado  = false;

        if(sala1 != null && sala1.getNome().equals(nome)){
            double custo = calcularCusto(sala1.getHoraInicial(), horaSaida);
            System.out.println("A reunião da equipe " + sala1.getNome() + " foi encerrada. Custo: R$ " + custo);
            sala1 = null;
            encontrado = true;
        } else if ( sala2 != null && sala1.getNome().equals(nome)){
            double custo = calcularCusto(sala2.getHoraInicial(), horaSaida);
            System.out.println("A reunião da equipe " + sala2.getNome() + " foi encerrada. Custo: R$ " + custo);
            sala2 = null;
            encontrado = true;
        } else if (sala3 != null && sala3.getNome().equals(nome)){
            double custo = calcularCusto(sala3.getHoraInicial(), horaSaida);
            System.out.println("A reunião da equipe " + sala3.getNome() + " foi encerrada. Custo: R$" + custo);
        }
    }
}
