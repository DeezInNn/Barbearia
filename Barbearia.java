class Barbearia {
    private Barbeiro[] barbeiros;

    public Barbearia() {
        barbeiros = new Barbeiro[]{
            new Barbeiro("Guilherme Lustosa"),
            new Barbeiro("Andre Luiz"),
            new Barbeiro("Arthur Oliveira")
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
