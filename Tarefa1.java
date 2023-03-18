public class Tarefa1 {
    public class Veiculo {
        private String placa;
        private int ano;

        public Veiculo(String placa, int ano) {
            this.placa = placa;
            this.ano = ano;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getPlaca() {
            return this.placa;
        }

        public int getAno() {
            return this.ano;
        }

        public void exibirDados() {
            System.out.println("Placa: " + this.placa);
            System.out.println("Ano: " + this.ano);
        }
    }

    public class Caminhao extends Veiculo {
        private int eixos;

        public Caminhao(String placa, int ano, int eixos) {
            super(placa, ano);
            this.eixos = eixos;
        }

        public void setEixos(int eixos) {
            this.eixos = eixos;
        }

        public int getEixos() {
            return this.eixos;
        }

        @Override
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Eixos: " + this.eixos);
        }
    }

    public class Onibus extends Veiculo {
        private int assentos;

        public Onibus(String placa, int ano, int assentos) {
            super(placa, ano);
            this.assentos = assentos;
        }

        public void setAssentos(int assentos) {
            this.assentos = assentos;
        }

        public int getAssentos() {
            return this.assentos;
        }

        @Override
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Assentos: " + this.assentos);
        }
    }
}
