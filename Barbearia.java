class Barbearia {
    private Barbeiro[] barbeiros;

    public Barbearia() {
        barbeiros = new Barbeiro[]{
            new Barbeiro("Willian Chaves (Barbeiro Will)"),
            new Barbeiro("Elias Torres(Seu Elias)"),
            new Barbeiro("Felipe Costa (Barba de Respeito)")
        };
    }

    public Barbeiro getBarbeiro(int index) {
        if (index >= 0 && index < barbeiros.length) {
            return barbeiros[index];
        }
        return null;
    }

    public void mostrarFilas() {
        for (Barbeiro barbeiro : barbeiros) {
            barbeiro.mostrarFila();
        }
    }
}
