package utfpr.fundamentos.exercicios.lista05.hotel;

public class Hotel {
    public static void main(String[] args) {
        Quarto quarto = new Quarto();

        // Check-In
        quarto.checkIn("Victor", "13821025930", 10);
        quarto.checkIn("Lauane", "13922489132", 20);
        quarto.checkIn("Renato", "12093831298", 17);

        // Check-Out
        quarto.checkOut("Victor", "13821025930", 21);

        // Check-In
        quarto.checkIn("Julia", "12229012432", 18);
        quarto.checkIn("Pablo", "23094810012", 11);
        quarto.checkIn("Railan", "12978349182", 14);

        // Check-Out de um hospede que nao existe
        quarto.checkOut("Fernanda", "23984238011", 10);

        // Check-In quando o hotel está lotado
        quarto.checkIn("Bruno", "23482304112", 12);
    }
}
