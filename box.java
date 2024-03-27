public class box {
    double width , height , depth;

    box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }

    box(){
        width=height=depth=0;
    }

    box(double len){
       width=height=depth=len ;
    }

    double volume(){
        return (width*height*depth);
    }

    public static void main(String[] args) {
        box mybox = new box (10,20,15);
        box mybox1= new box();
        box mybox2 = new box(7);

        double vol;

        vol= mybox.volume();
        System.out.println("The vol is "+ vol);

        vol = mybox1.volume();
        System.out.println("The vol is "+ vol);

        vol = mybox2.volume();
        System.out.println("The vol is "+ vol);
        
    }
}
