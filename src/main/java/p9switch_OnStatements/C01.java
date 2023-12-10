package p9switch_OnStatements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class C01 {
    public static void main(String[] args) {

        //siteden 5-6 adet veri cekilecek bunlar
        // formule konulup bize bir oran verecek
        // bu islemler gunluk veriler hrgun hesap yapılıp bulunan oran kaydedilecek
        // gunluk grafikler cıkacak
        // selenyumla veri cekilir sonra hesap yaparız
        // grafik


        try {
            String apiKey = "YOUR_API_KEY";
            String apiUrl = "https://api.coinmetrics.io/v4/timeseries/marketcapbtc?start=2023-01-01&end=2023-01-10";

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "ApiKey " + apiKey);

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuffer response = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
