import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wed extends World
{
    int actorCounter = 0;
    int Counter = 0;
    int first_enemy = 780;
    int score = 0;
    int hidup = 3;
    int kurang = 0;
    int tambah = 0;
    nilai scoreObject = null;
    nyawa scoreNyawa = null;
    /**
     * Constructor for objects of class wed.
     * 
     */
    public wed()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //pengurutan
        setPaintOrder(nilai.class,enemy.class,dino.class,batas_bawah.class,up_button.class);
        
        //dino objek
        dino Dino = new dino();
        addObject(Dino,100,330);
        
        //button up objek
        up_button Atas = new up_button();
        addObject(Atas,550,300);
        
        //batas bawah
        batas_bawah Lantai = new batas_bawah();
        addObject(Lantai,300,400);
        
        //batas kiri
        batas_kiri Tembok = new batas_kiri();
        addObject(Tembok,30,350);
        
        //nilai
        scoreObject = new nilai();
        addObject(scoreObject,100,100);
        scoreObject.setScore(0);

        //skor nyawa
        scoreNyawa = new nyawa();
        addObject(scoreNyawa,100,50);
        scoreNyawa.setScore(3);
        //gunung
        gunung Gunung = new gunung();
        addObject(Gunung,640,200);
        
        
    }
    public void tambah (int masuk)
    {
        score = masuk + tambah;
        tambah = score;
        scoreObject.setScore(score);
    }
    public void kurang(){
        hidup --;
        scoreNyawa.setScore(hidup);
        
        if(hidup == 0 ){
         
         GameOver();
        }
    }
    public void nambah(){
     hidup++;
     
     scoreNyawa.setScore(hidup);
    
    }
     public void act() {
        Counter++;
      
        if(Counter % 100 == 0){
            
         koin Koin = new koin();
         addObject(Koin,610,150+ Greenfoot.getRandomNumber(200));
        
        }
        if (Counter % 1000 == 0){
            midle Midle_top = new midle();
            addObject(Midle_top,900,225);
            midle2 Midle_down = new midle2();
            addObject(Midle_down,900,240);
            
        
        }
        if (Counter % 1500 == 0) {
          live Live = new live();
          addObject(Live,610,150+ Greenfoot.getRandomNumber(200));
        
        }
        if (Counter % 125 == 0){
            top Top = new top();
            addObject(Top,650,10);
    
            
        
        }
        if (Counter % 500 == 0){
        //gunung
        gunung Gunung = new gunung();
        addObject(Gunung,700,200);
        }
        if (Counter % 250 == 0){
            //create grabber
                create();
        }
        /*
        if (Counter >= first_enemy){
            if (actorCounter % 250 == 0){
            score++;
            scoreObject.setScore(score);
            //Greenfoot.playSound("score.wav");
            }   
           actorCounter++;
        }
        */
        if( Greenfoot.mousePressed(up_button.class)){
 
        }
        
    }
    private void create() {
        //musuh
        enemy Musuh = new enemy();
        addObject(Musuh,650,330 + Greenfoot.getRandomNumber(100) );
    
    }
    public void GameOver(){
    Greenfoot.setWorld(new GameOver());
    }
    public void Skor_akhir(){
    
        
        scoreObject = new nilai();
        addObject(scoreObject,100,100);
        scoreObject.setScore(score);
        
    }
}
