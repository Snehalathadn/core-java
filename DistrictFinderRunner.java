class DistrictFinderRunner
{
    public static void main(String[] args)
    {
        String stateName = "Karnataka";

        String[] totalDistricts =DistrictFinder.findDistrictsByStateName(stateName);

        int districts = totalDistricts.length;

        System.out.println("districts=" + districts);
    }
}