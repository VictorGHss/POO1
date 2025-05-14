package utfpr.fundamentos.exercicios.lista05.hotel;

public class Quarto {
    Hospede quarto1 = null;
    Hospede quarto2 = null;
    Hospede quarto3 = null;
    Hospede quarto4 = null;
    Hospede quarto5 = null;

    public void checkIn(String nome, String cpf, int horaCheckIn){
        if(quarto1 == null){
            quarto1 = new Hospede(nome, cpf, horaCheckIn);
            System.out.println("Hospede: " + nome + " alocado no quarto 1.");
        } else if (quarto2 == null){
            quarto2 = new Hospede(nome, cpf, horaCheckIn);
            System.out.println("Hospede: " + nome + " alocado no quarto 2.");
        } else if (quarto3 == null){
            quarto3 = new Hospede(nome, cpf, horaCheckIn);
            System.out.println("Hospede: " + nome + " alocado no quarto 3.");
        } else if (quarto4 == null){
            quarto4 = new Hospede(nome, cpf, horaCheckIn);
            System.out.println("Hospede: " + nome + " alocado no quarto 4.");
        } else if (quarto5 == null){
            quarto5 = new Hospede(nome, cpf, horaCheckIn);
            System.out.println("Hospede: " + nome + " alocado no quarto 5.");
        } else {
            System.out.println("Todos os quartos estão ocupados.");
        }
    }

    private double calcularCusto(int horaCheckin, int horaCheckOut){
        int horasPermanencia = horaCheckOut - horaCheckin;
        if (horasPermanencia < 2){
            return 50.0;
        } else {
            return 50.0 + (horasPermanencia - 2) * 10.00;
        }
    }

    public void checkOut(String nome, String cpf, int horaCheckOut){
        boolean encontrado = false;
        if(quarto1 != null && quarto1.getCpf().equals(cpf)){
            double custo = calcularCusto(quarto1.getHoraCheckIn(), horaCheckOut);
            System.out.println("Hospede: " + nome + " retirado do quarto 1. Custo: R$ " + custo);
            quarto1 = null;
            encontrado = true;
        } else if (quarto2 != null && quarto2.getCpf().equals(cpf)) {
            double custo = calcularCusto(quarto2.getHoraCheckIn(), horaCheckOut);
            System.out.println("Hospede: " + nome + " retirado do quarto 2. Custo: R$ " + custo);
            quarto2 = null;
            encontrado = true;
        } else if (quarto3 != null && quarto3.getCpf().equals(cpf)){
            double custo = calcularCusto(quarto3.getHoraCheckIn(), horaCheckOut);
            System.out.println("Hospede: " + nome + " retirado do quarto 3. Custo: R$ " + custo);
            quarto3 = null;
            encontrado = true;
        } else if (quarto4 != null && quarto4.getCpf().equals(cpf)){
            double custo = calcularCusto(quarto4.getHoraCheckIn(), horaCheckOut);
            System.out.println("Hospede: " + nome + " retirado do quarto 4. Custo: R$ " + custo);
            quarto3 = null;
            encontrado = true;
        } else if (quarto5 != null && quarto5.getCpf().equals(cpf)){
            double custo = calcularCusto(quarto5.getHoraCheckIn(), horaCheckOut);
            System.out.println("Hospede: " + nome + " retirado do quarto 5. Custo: R$ " + custo);
            quarto3 = null;
            encontrado = true;
        }
    }
}
