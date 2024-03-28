public class Computador {
    //Atributos
    public String marca;
    public float preco;
    public String brinde;

    SistemaOperacional so;
    HardwareBasico[] hb;
    Cliente cliente;
    MemoriaUSB usb;

    //Construtor
    public Computador(int promocao){
        this.hb = new  HardwareBasico[3];

        if(promocao == 1){
            this.marca = "Positivo";
            this.preco = 3300.00f;
            this.so = new SistemaOperacional("Linux Ubuntu", 32);
            hb[0] = new HardwareBasico("Pentium Core i3", 2200);
            hb[1] = new HardwareBasico("Memoria RAM", 8);
            hb[2] = new HardwareBasico("HD", 500f);
            this.brinde = "Pendrive de 16GB";
        }

        else if(promocao == 2){
            this.marca = "Acer";
            this.preco = 8800.00f;
            this.so = new SistemaOperacional("Windows 8", 64);
            hb[0] = new HardwareBasico("Pentium Core i5", 3370);
            hb[1] = new HardwareBasico("Memória RAM", 16);
            hb[2] = new HardwareBasico("HD", 1000);
            this.brinde = "Pendrive de 32GB";
        }

        else if(promocao == 3){
            this.marca = "Vaio";
            this.preco = 4800.00f;
            this.so = new SistemaOperacional("Windows 10", 64);
            hb[0] = new HardwareBasico("Pentium Core i7", 4500);
            hb[1] = new HardwareBasico("Memória RAM", 32);
            hb[2] = new HardwareBasico("HD", 2000f);
            this.brinde = "HD Externo de 1TB";

        }
    }

    //Métodos
    public void mostraPCConfigs(){
        System.out.println("------------------------------------");
        System.out.println("Infos do PC");
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Sistema Operacional: " + so.nome + " " + so.tipo + " bits");
        System.out.println("Acompanha: " + brinde);
        for (int i = 0; i < hb.length; i++) {
            if(hb[i] != null){
                System.out.println(hb[i].nome + " " + hb[i].capacidade );
            }
        }
        System.out.println("------------------------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        System.out.println("Memoria USB de " + musb.capacidade + "gb adicionada!");
    }
}
