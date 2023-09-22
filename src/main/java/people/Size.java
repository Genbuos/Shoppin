package people;

public enum Size {
    S("Small"), M("Medium"), L("Large");

    private final String sizeName;

   private Size (String sizeName){
       this.sizeName = sizeName;
   }

   public String getSize(){
       return sizeName;
   }
}
