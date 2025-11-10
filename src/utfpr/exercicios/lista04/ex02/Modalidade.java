package utfpr.exercicios.lista04.ex02;

public enum Modalidade {
    PRESENCIAL,
    SEMIPRESENCIAL,
    ONLINE;

    @Override
    public String toString() {
        return switch (this) {
            case PRESENCIAL -> "Presencial";
            case SEMIPRESENCIAL -> "Semipresencial";
            case ONLINE -> "Online";
        };
    }
}
