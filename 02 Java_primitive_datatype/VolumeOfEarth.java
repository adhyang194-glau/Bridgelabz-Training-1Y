class VolumrOfEarth{
  public static void main(String[] args){
  double radiuskm = 6378;
  double radiusmiles = radiuskm * 0.621371 ;
  double volumekm = (4 / 3) * Math.PI * Math.pow(radiuskm , 3);
  double volumemiles = (4 / 3) * Math.PI * Math.pow(radiusmiles , 3);
  System.out.println("Volume of earth in km" + volumekm);
  System.out.println("Volume of earth in miles" + volumemiles);
  }
}