class company
{
    public void playMusic()
    {
        System.out.println("Music Playing..");
    }

    public String getApen(int cost)
    {
        if (cost >= 10)
            return "Pen"; // In function the moment true value will come, code will stop executing
        // else
        //     return "Not enough Money";
        return "Not enough Money";
    }
}



public class PMethod
{
    public static void main(String args[])
    {        
        company Bollywood = new company();
        
        Bollywood.playMusic();

        String result = Bollywood.getApen(12);
        System.out.println(result);
    }
}
