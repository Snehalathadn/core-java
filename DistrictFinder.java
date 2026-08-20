class DistrictFinder
{
    public static String[] findDistrictsByStateName(String stateName)
    {
        System.out.println("running DistrictFinder in findDistrictsByStateName");
        System.out.println("stateName=" + stateName);

        if(stateName == "AndhraPradesh")
        {
            String[] districts = {"Alluri Sitharama Raju", "Anakapalli", "Ananthapuramu","Annamayya", "Bapatla", "Chittoor","Dr. B.R. Ambedkar Konaseema", "East Godavari", "Eluru","Guntur", "Kakinada", "Krishna", "Kurnool", "Nandyal","NTR district", "Palnadu", "Parvathipuram Manyam", "Prakasam","Srikakulam", "Sri Sathya Sai", "SPSR Nellore","Tirupati", "Visakhapatnam", "Vizianagaram","West Godavari", "YSR Kadapa"};
			
            return districts;
        }

        else if(stateName == "ArunachalPradesh")
        {
            String[] districts = {"Anjaw", "Bichom", "Changlang", "Dibang Valley","East Kameng", "East Siang", "Kamle", "Keyi Panyor","Kra Daadi", "Kurung Kumey", "Lepa Rada", "Lohit","Longding", "Lower Dibang Valley", "Lower Siang","Lower Subansiri", "Namsai", "Pakke Kessang","Papum Pare", "Shi Yomi", "Siang", "Tawang","Tirap", "Upper Siang", "Upper Subansiri","west Kameng","west siang"};
			
            return districts;
        }

        else if(stateName == "Assam")
        {
            String[] districts = {"Baksa", "Barpeta", "Biswanath", "Bongaigaon","Cachar", "Charaideo", "Chirang", "Darrang","Dhemaji", "Dhubri", "Dibrugarh", "Dima Hasao","Goalpara", "Golaghat", "Hailakandi", "Hojai","Jorhat", "Kamrup", "Kamrup Metropolitan","Karbi Anglong", "Karimganj", "Kokrajhar","Lakhimpur", "Majuli", "Morigaon", "Nagaon","Nalbari", "Sivasagar", "Sonitpur","South Salmara-Mankachar", "Tamulpur", "Tinsukia","Udalguri","Sribhumi"};
			
            return districts;
        }

        else if(stateName == "Bihar")
        {
            String[] districts = {"Araria", "Arwal", "Aurangabad", "Banka","Begusarai", "Bhagalpur", "Bhojpur", "Buxar","Darbhanga", "East Champaran", "Gaya", "Gopalganj","Jamui", "Jehanabad", "Kaimur", "Katihar","Khagaria", "Kishanganj", "Lakhisarai", "Madhepura","Madhubani", "Munger", "Muzaffarpur", "Nalanda","Nawada", "Patna", "Purnia", "Rohtas", "Saharsa","Samastipur", "Saran", "Sheikhpura", "Sheohar","Sitamarhi", "Siwan", "Supaul", "Vaishali","West Champaran"};
			
            return districts;
        }

        else if(stateName == "Chhattisgarh")
        {
            String[] districts = {"Balod", "Baloda Bazar", "Balrampur-Ramanujganj","Bastar", "Bemetara", "Bijapur", "Bilaspur","Dantewada", "Dhamtari", "Durg", "Gariaband","Gaurela-Pendra-Marwahi", "Janjgir-Champa", "Jashpur","Kabirdham", "Kanker", "Khairagarh-Chhuikhadan-Gandai","Kondagaon", "Korba", "Koriya", "Mahasamund","Manendragarh-Chirmiri-Bharatpur","Mohla-Manpur-Ambagarh Chowki", "Mungeli","Narayanpur", "Raigarh", "Raipur", "Rajnandgaon","Sakti", "Sarangarh-Bilaigarh", "Sukma","Surajpur", "Surguja"};
			
            return districts;
        }

        else if(stateName == "Goa")
        {
            String[] districts = {"North Goa","South Goa","kushavati"};
			
            return districts;
        }

        else if(stateName == "Gujarat")
        {
            String[] districts = {"Ahmedabad", "Amreli", "Anand", "Aravalli","Banaskantha", "Bharuch", "Bhavnagar", "Botad","Chhota Udaipur", "Dahod", "Dang", "Devbhumi Dwarka","Gandhinagar", "Gir Somnath", "Jamnagar", "Junagadh","Kheda", "Kutch", "Mahisagar", "Mehsana", "Morbi","Narmada", "Navsari", "Panchmahal", "Patan","Porbandar", "Rajkot", "Sabarkantha", "Surat","Surendranagar", "Tapi", "Vadodara", "Valsad"};
			
            return districts;
        }

        else if(stateName == "Haryana")
        {
            String[] districts = {"Ambala", "Bhiwani", "Charkhi Dadri", "Faridabad","Fatehabad", "Gurugram", "Hisar", "Jhajjar", "Jind","Kaithal", "Karnal", "Kurukshetra", "Mahendragarh","Nuh", "Palwal", "Panchkula", "Panipat", "Rewari","Rohtak", "Sirsa", "Sonipat", "Yamunanagar"};
			
            return districts;
        }

        else if(stateName == "HimachalPradesh")
        {
            String[] districts = {"Bilaspur", "Chamba", "Hamirpur", "Kangra","Kinnaur", "Kullu", "Lahaul and Spiti", "Mandi","Shimla", "Sirmaur", "Solan", "Una"};
			
            return districts;
        }

        else if(stateName == "Jharkhand")
        {
            String[] districts = {"Bokaro", "Chatra", "Deoghar", "Dhanbad", "Dumka","East Singhbhum", "Garhwa", "Giridih", "Godda","Gumla", "Hazaribagh", "Jamtara", "Khunti", "Koderma","Latehar", "Lohardaga", "Pakur", "Palamu", "Ramgarh","Ranchi", "Sahebganj", "Seraikela Kharsawan","Simdega", "West Singhbhum"};
			
            return districts;
        }

        else if(stateName == "Karnataka")
        {
            String[] districts = {"Bagalkot", "Ballari", "Belagavi", "Bengaluru Rural","Bengaluru Urban", "Bidar", "Chamarajanagar","Chikkaballapur", "Chikkamagaluru", "Chitradurga","Dakshina Kannada", "Davanagere", "Dharwad", "Gadag","Hassan", "Haveri", "Kalaburagi","Kodagu", "Kolar","Koppal", "Mandya", "Mysuru", "Raichur", "Ramanagara","Shivamogga", "Tumakuru", "Udupi", "Uttara Kannada","Vijayapura", "Vijayanagara", "Yadgir"};
			
            return districts;
        }

        else if(stateName == "Kerala")
        {
            String[] districts = {"Alappuzha", "Ernakulam", "Idukki", "Kannur","Kasaragod", "Kollam", "Kottayam", "Kozhikode","Malappuram", "Palakkad", "Pathanamthitta","Thiruvananthapuram", "Thrissur", "Wayanad"};
			
            return districts;
        }

        else if(stateName == "MadhyaPradesh")
        {
            String[] districts = {"Agar Malwa", "Alirajpur", "Anuppur", "Ashoknagar","Balaghat", "Barwani", "Betul", "Bhind", "Bhopal","Burhanpur", "Chhatarpur", "Chhindwara", "Damoh","Datia", "Dewas", "Dhar", "Dindori", "Guna","Gwalior", "Harda", "Indore", "Jabalpur", "Jhabua","Katni", "Khandwa", "Khargone", "Maihar", "Mandla","Mandsaur", "Mauganj", "Morena", "Narmadapuram","Narsinghpur", "Neemuch", "Niwari", "Panna","Raisen", "Rajgarh", "Ratlam", "Rewa", "Sagar","Satna", "Sehore", "Seoni", "Shahdol", "Shajapur","Sheopur", "Shivpuri", "Sidhi", "Singrauli", "Tikamgarh","Ujjain", "Umaria", "Vidisha"};
			
            return districts;
        }

        else if(stateName == "Maharashtra")
        {
            String[] districts = {"Ahmednagar", "Akola", "Amravati", "Aurangabad","Beed", "Bhandara", "Buldhana", "Chandrapur","Dhule", "Gadchiroli", "Gondia", "Hingoli","Jalgaon", "Jalna", "Kolhapur", "Latur","Mumbai City", "Mumbai Suburban", "Nagpur", "Nanded","Nandurbar", "Nashik", "Osmanabad", "Palghar","Parbhani", "Pune", "Raigad", "Ratnagiri","Sangli", "Satara", "Sindhudurg", "Solapur","Thane", "Wardha", "Washim", "Yavatmal"};
			
            return districts;
        }

        else if(stateName == "Manipur")
        {
            String[] districts = {"Bishnupur", "Chandel", "Churachandpur", "Imphal East","Imphal West", "Jiribam", "Kakching", "Kamjong","Kangpokpi", "Noney", "Pherzawl", "Senapati","Tamenglong", "Tengnoupal", "Thoubal", "Ukhrul"};
			
            return districts;
        }

        else if(stateName == "Meghalaya")
        {
            String[] districts = {"East Garo Hills", "East Jaintia Hills","East Khasi Hills", "Eastern West Khasi Hills","North Garo Hills", "Ri-Bhoi", "South Garo Hills","South West Garo Hills", "South West Khasi Hills","West Garo Hills", "West Jaintia Hills","West Khasi Hills"};
			
            return districts;
        }

        else if(stateName == "Mizoram")
        {
            String[] districts = {"Aizawl", "Champhai", "Hnahthial", "Khawzawl","Kolasib", "Lawngtlai", "Lunglei", "Mamit","Saiha", "Saitual", "Serchhip"};
			
            return districts;
        }

        else if(stateName == "Nagaland")
        {
            String[] districts = {"Chumoukedima", "Dimapur", "Kiphire", "Kohima","Longleng", "Mokokchung", "Mon", "Niuland","Noklak", "Peren", "Phek", "Shamator","Tseminyu", "Tuensang", "Wokha", "Zunheboto"};
			
            return districts;
        }

        else if(stateName == "Odisha")
        {
            String[] districts = {"Angul", "Balangir", "Balasore", "Bargarh","Bhadrak", "Boudh", "Cuttack", "Deogarh","Dhenkanal", "Gajapati", "Ganjam", "Jagatsinghpur","Jajpur", "Jharsuguda", "Kalahandi", "Kandhamal","Kendrapara", "Kendujhar", "Khordha", "Koraput","Malkangiri", "Mayurbhanj", "Nabarangpur","Nayagarh", "Nuapada", "Puri", "Rayagada","Sambalpur", "Subarnapur", "Sundargarh"};
			
            return districts;
        }

        else if(stateName == "Punjab")
        {
            String[] districts = {"Amritsar", "Barnala", "Bathinda", "Faridkot","Fatehgarh Sahib", "Fazilka", "Ferozepur", "Gurdaspur","Hoshiarpur", "Jalandhar", "Kapurthala", "Ludhiana","Malerkotla", "Mansa", "Moga", "Pathankot","Patiala", "Rupnagar", "Sahibzada Ajit Singh Nagar","Sangrur", "Shahid Bhagat Singh Nagar","Sri Muktsar Sahib", "Tarn Taran"};
			
            return districts;
        }

        else if(stateName == "Rajasthan")
        {
            String[] districts = {"Ajmer", "Alwar", "Balotra", "Banswara", "Baran","Barmer", "Beawar", "Bharatpur", "Bhilwara","Bikaner", "Bundi", "Chittorgarh", "Churu", "Dausa","Deeg", "Dholpur", "Didwana-Kuchaman","Dungarpur", "Gangapur City", "Hanumangarh","Jaipur", "Jaisalmer", "Jalore", "Jhalawar","Jhunjhunu", "Jodhpur", "Karauli", "Khairthal-Tijara","Kota", "Kotputli-Behror", "Nagaur","Pali", "Phalodi", "Pratapgarh", "Rajsamand","Salumbar", "Sawai Madhopur", "Sikar", "Sirohi", "Tonk", "Udaipur"};
			
            return districts;
        }

        else if(stateName == "Sikkim")
        {
            String[] districts = {"Gangtok","Gyalshing","Mangan","Namchi","Pakyong","Soreng"};
			
            return districts;
        }

        else if(stateName == "TamilNadu")
        {
            String[] districts = {"Ariyalur", "Chengalpattu", "Chennai", "Coimbatore","Cuddalore", "Dharmapuri", "Dindigul", "Erode","Kallakurichi", "Kanchipuram", "Kanyakumari","Karur", "Krishnagiri", "Madurai", "Mayiladuthurai","Nagapattinam", "Namakkal", "Nilgiris","Perambalur", "Pudukkottai", "Ramanathapuram","Ranipet", "Salem", "Sivaganga", "Tenkasi","Thanjavur", "Theni", "Thoothukudi", "Tiruchirappalli","Tirunelveli", "Tirupathur", "Tiruppur", "Tiruvallur","Tiruvarur", "Tiruvannamalai", "Vellore","Viluppuram", "Virudhunagar"};
			
            return districts;
        }

        else if(stateName == "Telangana")
        {
            String[] districts = {"Adilabad", "Bhadradri Kothagudem", "Hanamkonda","Hyderabad", "Jagtial", "Jangaon", "Jayashankar Bhupalpally","Jogulamba Gadwal", "Kamareddy", "Karimnagar","Khammam", "Komaram Bheem Asifabad", "Mahabubabad","Mahabubnagar", "Mancherial", "Medak", "Medchal-Malkajgiri","Mulugu", "Nagarkurnool", "Nalgonda", "Narayanpet","Nirmal", "Nizamabad", "Peddapalli", "Rajanna Sircilla","Rangareddy", "Sangareddy", "Siddipet", "Suryapet","Vikarabad", "Wanaparthy", "Warangal", "Yadadri Bhuvanagiri"};
			
            return districts;
        }

        else if(stateName == "Tripura")
        {
            String[] districts = {"Dhalai","Gomati","Khowai","North Tripura","Sepahijala","South Tripura","Unakoti","West Tripura"};
			
            return districts;
        }

        else if(stateName == "UttarPradesh")
        {
            String[] districts = {"Agra", "Aligarh", "Ambedkar Nagar", "Amethi","Amroha", "Auraiya", "Ayodhya", "Azamgarh","Baghpat", "Bahraich", "Ballia", "Balrampur","Banda", "Barabanki", "Bareilly", "Basti","Bhadohi", "Bijnor", "Budaun", "Bulandshahr","Chandauli", "Chitrakoot", "Deoria", "Etah","Etawah", "Farrukhabad", "Fatehpur", "Firozabad","Gautam Buddha Nagar", "Ghaziabad", "Ghazipur","Gonda", "Gorakhpur", "Hamirpur", "Hapur","Hardoi", "Hathras", "Jalaun", "Jaunpur","Jhansi", "Kannauj", "Kanpur Dehat", "Kanpur Nagar","Kasganj", "Kaushambi", "Kheri", "Kushinagar","Lalitpur", "Lucknow", "Maharajganj", "Mahoba","Mainpuri", "Mathura", "Mau", "Meerut","Mirzapur", "Moradabad", "Muzaffarnagar", "Pilibhit","Pratapgarh", "Prayagraj", "Raebareli", "Rampur","Saharanpur", "Sambhal", "Sant Kabir Nagar","Shahjahanpur", "Shamli", "Shravasti", "Siddharthnagar","Sitapur", "Sonbhadra", "Sultanpur", "Unnao","Varanasi"};
			
            return districts;
        }

        else if(stateName == "Uttarakhand")
        {
            String[] districts = {"Almora", "Bageshwar", "Chamoli", "Champawat","Dehradun", "Haridwar", "Nainital", "Pauri Garhwal","Pithoragarh", "Rudraprayag", "Tehri Garhwal","Udham Singh Nagar", "Uttarkashi"};
			
            return districts;
        }

        else if(stateName == "WestBengal")
        {
            String[] districts = {"Alipurduar", "Bankura", "Paschim Bardhaman","Purba Bardhaman", "Birbhum", "Cooch Behar","Darjeeling", "Hooghly", "Howrah", "Jalpaiguri","Jhargram", "Kalimpong", "Kolkata", "Maldah","Murshidabad", "Nadia", "North 24 Parganas","South 24 Parganas", "Paschim Medinipur","Purba Medinipur", "Uttar Dinajpur", "Dakshin Dinajpur"};
			
            return districts;
        }

        System.out.println("name not matched, return empty");

        String[] empty = {};
        return empty;
    }
}