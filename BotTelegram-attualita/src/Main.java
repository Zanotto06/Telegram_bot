import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import java.util.List;
import java.sql.Date;

public class Main {
    /*public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new MyTelegramBot());
            System.out.println("Bot started successfully!");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }*/
    public static void main(String[] args) {
        Database database = new Database();

        System.out.println(database.leggiNotizie().toString() + "\n" + database.leggiEventi().toString());

        /*// Inserire una nuova notizia
        database.inserisciNotizia(
                "Titolo Importante",
                "Descrizione della notizia",
                new Date(System.currentTimeMillis())
        );

        // Inserire un nuovo evento
        database.inserisciEvento(
                "Titolo dell'Evento",
                "Luogo dell'evento",
                new Date(System.currentTimeMillis())
        );

        // Leggere tutte le notizie
        List<Database.Notizia> tutteLeNotizie = database.leggiNotizie();

        // Leggere tutti gli eventi
        List<Database.Evento> tuttiGliEventi = database.leggiEventi();

        // Chiudere la connessione
        database.chiudiConnessione();*/
    }
}
