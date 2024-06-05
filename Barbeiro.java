import java.util.LinkedList;
import java.util.Queue;

class Barbeiro {
    private String nome;
    private Queue<Cliente> fila;

    public Barbeiro(String nome) {
        this.nome = nome;
        this.fila = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
    }

    public Cliente removerCliente() {
        return fila.poll();
    }

    public void mostrarFila() {
        System.out.println("Fila de " + nome + ":");
        if (fila.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
        } else {
            for (Cliente cliente : fila) {
                System.out.println(cliente);
            }
        }
    }
}
