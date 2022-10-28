package mygame;


import com.jme3.app.SimpleApplication;
import com.jme3.input.controls.ActionListener;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;


public class Main extends SimpleApplication {

    public double angulo, angulo2, angulo3, angulo4, angulo5, angulo6, angulo7, angulo8, angulo9= 0; 
        
    
        Sphere sol = new Sphere(32, 32, 5f);
        Geometry geomSol = new Geometry("Sphere", sol);
        
        Sphere mercurio = new Sphere(32, 32, 1f);
        Geometry geomMercurio = new Geometry("Sphere", mercurio);
        
        Sphere venus = new Sphere(32, 32, 2.2f);
        Geometry geomVenus = new Geometry("Sphere", venus);
        
        Sphere tierra = new Sphere(32, 32, 2.2f);
        Geometry geomTierra = new Geometry("Sphere", tierra);
        
        Sphere marte = new Sphere(32, 32, 1.5f);
        Geometry geomMarte = new Geometry("Sphere", marte);
        
        Sphere jupiter = new Sphere(32, 32, 4f);
        Geometry geomJupiter = new Geometry("Sphere", jupiter);
        
        Sphere saturno = new Sphere(32, 32, 3f);
        Geometry geomSaturno = new Geometry("Sphere", saturno);
        
        Sphere urano = new Sphere(32, 32, 2f);
        Geometry geomUrano = new Geometry("Sphere", urano);
        
        Sphere neptuno = new Sphere(32, 32, 2f);
        Geometry geomNeptuno = new Geometry("Sphere", neptuno);
        
        
       
        Vector3f sol1= new Vector3f(0.0f, 1.0f, 1.0f);
        Vector3f mercurio1 = new Vector3f(1.0f, 10.0f, 10.0f);
        Vector3f venus1= new Vector3f(20.0f, 1.0f, 1.0f);
        Vector3f tierra1 = new Vector3f(11.0f, 1.0f, 1.0f);
        Vector3f marte1 = new Vector3f(14.0f, 1.0f, 1.0f);
        Vector3f jupiter1 = new Vector3f(17.0f, 1.0f, 1.0f);
        Vector3f saturno1 = new Vector3f(20.0f, 1.0f, 1.0f);
        Vector3f urano1 = new Vector3f(23f, 1.0f, 1.0f);
        Vector3f neptuno1 = new Vector3f(26f, 1.0f, 1.0f);
        
    @Override
    public void simpleInitApp() {
        
        flyCam.setMoveSpeed(30f);
        cam.setLocation(new Vector3f(0,0,20));
              
        
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat3 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat4 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat5 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat6 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat7 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat8 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat9 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        
        
        mat.setTexture("ColorMap", assetManager.loadTexture("Textures/sol.jpg"));
        mat2.setTexture("ColorMap", assetManager.loadTexture("Textures/mercurio.jpg"));
        mat3.setTexture("ColorMap", assetManager.loadTexture("Textures/venus.jpg"));
        mat4.setTexture("ColorMap", assetManager.loadTexture("Textures/planeta_tierra.jpg"));
        mat5.setTexture("ColorMap", assetManager.loadTexture("Textures/marte.jpg"));
        mat6.setTexture("ColorMap", assetManager.loadTexture("Textures/jupiter.jpg"));         
        mat7.setTexture("ColorMap", assetManager.loadTexture("Textures/saturno.jpg"));
        mat8.setTexture("ColorMap", assetManager.loadTexture("Textures/urano.jpg"));
        mat9.setTexture("ColorMap", assetManager.loadTexture("Textures/neptuno.jpg"));
        
        geomSol.setMaterial(mat);
        geomMercurio.setMaterial(mat2);
        geomVenus.setMaterial(mat3);
        geomTierra.setMaterial(mat4);
        geomMarte.setMaterial(mat5);
        geomJupiter.setMaterial(mat6);
        geomSaturno.setMaterial(mat7);
        geomUrano.setMaterial(mat8);
        geomNeptuno.setMaterial(mat9);
               
        
        
        rootNode.attachChild(geomSol);
        rootNode.attachChild(geomMercurio);
        rootNode.attachChild(geomVenus);
        rootNode.attachChild(geomTierra);
        rootNode.attachChild(geomMarte);
        rootNode.attachChild(geomJupiter);
        rootNode.attachChild(geomSaturno);
        rootNode.attachChild(geomUrano);
        rootNode.attachChild(geomNeptuno);
        
        
    }
    
    private ActionListener actionListener = new ActionListener() {
        public void onAction(String name, boolean isPressed, float tpf) {
            System.out.println("Mapping detected (discrete): " + name);
            geomSol.setLocalTranslation(1f, 0, 0); 
        }
    };

    @Override
    public void simpleUpdate(float tpf) {
        
        angulo = angulo + 0.04;
        angulo2 = angulo2 + 0.02;
        angulo3 = angulo3 + 0.015;
        angulo4 = angulo4 + 0.0097;
        angulo5 = angulo5 + 0.0085;
        angulo6 = angulo6 + 0.0080;
        angulo7 = angulo7 + 0.007;
        angulo8 = angulo8 + 0.0065;
        
        
        
        float r = FastMath.DEG_TO_RAD;
        double Merc = FastMath.DEG_TO_RAD*angulo;
        double Ven = FastMath.DEG_TO_RAD*angulo2;
        double Tier = FastMath.DEG_TO_RAD*angulo3;
        double Marte = FastMath.DEG_TO_RAD*angulo4;
        double Jupi = FastMath.DEG_TO_RAD*angulo5;
        double Satur = FastMath.DEG_TO_RAD*angulo6;
        double Uran = FastMath.DEG_TO_RAD*angulo7;
        double Neptu = FastMath.DEG_TO_RAD*angulo8;
        
        
        //Se otroga la posicion de los planetas alrededor del sol
        
        int rMer = 7;
        int rVenus = 12;
        int rTierra = 17;
        int rMarte = 22;
        int rJupiter = 32;
        int rSaturno = 40;
        int rUrano = 44;
        int rNeptuno = 48;
    
        
        
        //Cordenadas de los planetas con respecto al sol
        
        float xMer = (float) Math.sin(Merc)*rMer;
        float yMer = (float) Math.cos(Merc)*rMer;
        
        float xVenus = (float) Math.sin(Ven)*rVenus;
        float yVenus = (float) Math.cos(Ven)*rVenus;
        
        float xTierra = (float) Math.sin(Tier)*rTierra;
        float yTierra = (float) Math.cos(Tier)*rTierra;
        
        float xMarte = (float) Math.sin(Marte)*rMarte;
        float yMarte = (float) Math.cos(Marte)*rMarte;
        
        float xJupiter = (float) Math.sin(Jupi)*rJupiter;
        float yJupiter = (float) Math.cos(Jupi)*rJupiter;
        
        float xSaturno = (float) Math.sin(Satur)*rSaturno;
        float ySaturno = (float) Math.cos(Satur)*rSaturno;
        
        float xUrano = (float) Math.sin(Uran)*rUrano;
        float yUrano = (float) Math.cos(Uran)*rUrano;
        
        float xNeptuno = (float) Math.sin(Neptu)*rNeptuno;
        float yNeptuno = (float) Math.cos(Neptu)*rNeptuno;     
     
        //Se implementa la rotacion de los planetas respecto al sol
        geomMercurio.rotate((float) (r*0.5),0f,0f);
        geomVenus.rotate((float) (r*0.5),0f,0f);
        geomTierra.rotate((float) (r*0.5),0f,0f);
        geomMarte.rotate((float) (r*0.5),0f,0f);
        geomJupiter.rotate((float) (r*0.5),0f,0f);
        geomSaturno.rotate((float) (r*0.5),0f,0f);
        geomUrano.rotate((float) (r*0.5),0f,0f);
        geomNeptuno.rotate((float) (r*0.5),0f,0f);
       
        
        //Se implementa la traslacion de los planetas
        
        Vector3f orbMercurio = new Vector3f (xMer , yMer, 0);
        Vector3f orbVenus = new Vector3f (xVenus , yVenus, 0);
        Vector3f orbTierra = new Vector3f (xTierra , yTierra, 0);
        Vector3f orbMarte = new Vector3f (xMarte , yMarte, 0);
        Vector3f orbJupiter = new Vector3f (xJupiter , yJupiter, 0);
        Vector3f orbSaturno = new Vector3f (xSaturno , ySaturno, 0);
        Vector3f orbUrano = new Vector3f (xUrano , yUrano, 0);
        Vector3f orbNeptuno = new Vector3f (xNeptuno , yNeptuno, 0);
        
        
        geomMercurio.setLocalTranslation(orbMercurio);
        geomVenus.setLocalTranslation(orbVenus);
        geomTierra.setLocalTranslation(orbTierra);
        geomMarte.setLocalTranslation(orbMarte);
        geomJupiter.setLocalTranslation(orbJupiter);
        geomSaturno.setLocalTranslation(orbSaturno);
        geomUrano.setLocalTranslation(orbUrano);
        geomNeptuno.setLocalTranslation(orbNeptuno);
        
        
        }
    
   

       
   

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
    
    public static void main(String[] args) {
       Main app = new Main();
        app.start();
    }
}
