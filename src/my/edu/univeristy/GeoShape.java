package my.edu.univeristy;

public abstract  class GeoShape {

    protected String figureType;

    protected GeoShape(String figureType){
        this.figureType = figureType;
    }

    public abstract void draw();

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        return "GeoShape{" +
                "figureType='" + figureType + '\'' +
                '}';
    }
}
