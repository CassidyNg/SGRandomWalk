public class SGRandomWalk {
    public static void main (String[]args){
        int steps = 0;
        /*Rectangle box = new Rectangle(5, 10, 60, 80);
        box.draw();
        Ellipse egg = new Ellipse(100, 100, 40, 60);
        egg.setColor(Color.YELLOW);
        egg.fill();*/    
        Ellipse circle = new Ellipse(50, 50, 200, 200);
        //TL - (50, 50), TR - (250, 50), BL - (50, 250), BR - (250, 250)
        circle.draw();
        Ellipse player = new Ellipse(150, 150, 10, 10);
        player.draw();
        player.setColor(Color.RED);
        player.fill();

        int xPos = player.getX();
        int yPos = player.getY();
        while(Math.pow(xPos - 159, 2) + Math.pow(yPos - 150, 2) < Math.pow(100, 2)){
            try { Thread.sleep(100);}
                                                          catch(Exception ex) {};
            int xStep = (int)(Math.random() * 21) - 10;
            int yStep = (int)(Math.random() * 21) - 10;
            player.translate(xStep, yStep);
            steps++;
            xPos = player.getX();
            yPos = player.getY();
        }
        System.out.println("Escaped in " + steps + " steps");
    } 
}
