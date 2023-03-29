public class Penjualan {
    String kode, nama;
    float harga;
    int jumlah;

    void setData(String kode, String nama, float harga, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    float getTotalPembelian(){
        return this.harga * this.jumlah;
    }

    String getBonus(){
        if((getTotalPembelian() >= 500000) && (jumlah > 5)){
            return "Setrika";
        }else if(((getTotalPembelian() >= 100000) && (getTotalPembelian() < 500000)) && (jumlah > 3)){
            return "Payung";
        }else if(((getTotalPembelian() >= 50000) && (getTotalPembelian() < 100000)) && (jumlah > 2)){
            return "Ballpoint";
        }else{
            return "-";
        }
    }

    void cetakNota(){
        System.out.println("======== NOTA ========");
        System.out.println("Kode    : "+this.kode);
        System.out.println("Nama    : "+this.nama);
        System.out.println("Harga   : "+this.harga);
        System.out.println("Jumlah  : "+this.jumlah);
        System.out.println("Bonus   : "+getBonus());
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String run;

        run = "Y";
        while (run.equals("Y")){
            System.out.println("===PENJUALAN===");
            var Jual = new Penjualan();
            System.out.print("Kode      : ");
            Jual.kode = input.next();
            System.out.print("Nama      : ");
            Jual.nama = input.next();
            System.out.print("Jumlah    : ");
            Jual.jumlah = input.nextInt();
            System.out.print("Harga     : ");
            Jual.harga = input.nextFloat();

            Jual.setData(Jual.kode, Jual.nama, Jual.harga, Jual.jumlah);
            System.out.println(" ");
            Jual.cetakNota();

            System.out.print("Input data lagi? [Y/T]    : ");
            run = input.next();
            System.out.println(" ");
        }
    }
}
