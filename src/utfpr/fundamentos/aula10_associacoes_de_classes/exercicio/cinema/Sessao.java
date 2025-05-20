package utfpr.fundamentos.aula10_associacoes_de_classes.exercicio.cinema;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Sessao implements TemplateCinema {
    private Date data;
    private String horario; // Ex: "14:30"
    private Sala sala;
    private Filme filme;
    private List<Ingresso> ingressos;

    public Sessao(Date data, String horario, Sala sala, Filme filme) {
        this.data = data;
        this.horario = horario;
        this.sala = sala;
        this.filme = filme;
        this.ingressos = new ArrayList<>();

    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    // Método para gerar e adicionar ingressos para a sessão até a capacidade da sala
    public void gerarIngressos(double valorBaseIngresso) {
        if (this.sala != null) {
            this.ingressos.clear();
            for (int i = 1; i <= this.sala.getCapacidade(); i++) {
                if (i % 5 == 0 && i <= this.sala.getCapacidade() * 0.3) {
                    this.ingressos.add(new MeiaEntrada(i, valorBaseIngresso, this));
                } else {
                    this.ingressos.add(new Ingresso(i, valorBaseIngresso, this));
                }
            }
            System.out.println(this.ingressos.size() + " ingressos gerados para a sessão.");
        } else {
            System.out.println("Não é possível gerar ingressos: sala não definida para a sessão.");
        }
    }

    public void adicionarIngresso(Ingresso ingresso) {
        if (ingresso != null && ingresso.getSessao() == this) {
            this.ingressos.add(ingresso);
        }
    }

    public int getIngressosDisponiveis() {
        int count = 0;
        for (Ingresso ingresso : ingressos) {
            if (ingresso.isDisponivel()) {
                count++;
            }
        }
        return count;
    }


    @Override
    public void cadastrar() {
        System.out.println("Sessão em " + data + " às " + horario + " para o filme '" + (filme != null ? filme.getTitulo() : "N/D") + "' na sala " + (sala != null ? sala.getNumeroSala() : "N/D") + " cadastrada.");
    }

    @Override
    public void editar() {
        System.out.println("Sessão em " + data + " às " + horario + " editada.");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando sessão em " + data + " às " + horario + ".");
    }

    @Override
    public void remover() {
        System.out.println("Sessão em " + data + " às " + horario + " removida.");
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "data=" + data +
                ", horario='" + horario + '\'' +
                ", sala=" + (sala != null ? sala.getNumeroSala() : "N/A") +
                ", filme=" + (filme != null ? filme.getTitulo() : "N/A") +
                ", ingressosDisponiveis=" + getIngressosDisponiveis() + "/" + ingressos.size() +
                '}';
    }
}
