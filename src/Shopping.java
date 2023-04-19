public class Shopping {
    private String nama;
    private double total;
    private double diskon;
    private double diskonMember;
    private double hargaDiskon;

    public Shopping(String nama, double total, double diskon) {
        this.nama = nama;
        this.total = total;
        this.diskon = diskon;
    }

    //overloading contructor
    public Shopping() {
        this("Budi", 500000, 0.15);
    }

    public Shopping(String nama, double total) {
        this(nama, total, 0.25);
    }

    public double hargaDiskon(double total) {
        if (total <= 500000) {
            hargaDiskon = (total - (total * 0.15));
        } else if (total > 500000) {
            hargaDiskon = (total - (total * 0.25));
        }
        return hargaDiskon; //method nonvoid
    }

    //overloading method dan method void
    public void rincian() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Total Belanja : " + this.total);
        System.out.println("Potongan : " + this.diskon);
        System.out.println("Harga setelah diskon: " + hargaDiskon(this.total));
        System.out.println("");
    }

    public void rincian(double diskonMember) {
        System.out.println("Nama : " + this.nama);
        System.out.println("Total Belanja : " + this.total);
        System.out.println("Potongan : " + this.diskon);
        System.out.println("Diskon member : " + diskonMember);
        System.out.println("Harga setelah diskon: " + (hargaDiskon(this.total) - (this.total * diskonMember)));
    }
}