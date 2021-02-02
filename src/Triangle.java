public class Triangle {
    double base;
    double height;
    double Sidelengthone;
    double Sidelengthtwo;
    double Sidelengththree;

    public Triangle(double base,
                    double height,
                    double Sidelengthone,
                    double Sidelengthtwo,
                    double Sidelengththree){
        this.base = base;
        this.height=height;
        this.Sidelengthone=Sidelengthone;
        this.Sidelengthtwo=Sidelengthtwo;
        this.Sidelengththree=Sidelengththree;
    }

    public double FindArea(){
        return (this.base * this.height / 2);
    }
}
