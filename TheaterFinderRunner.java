class TheaterFinderRunner
{
    public static void main(String[] args)
    {
        String movieName = "Fidaa";

        String[] totalTheater =TheaterFinder.getTheaterByMovieName(movieName);

        int theaters = totalTheater.length;

        System.out.println("theaters=" + theaters);
    }
}