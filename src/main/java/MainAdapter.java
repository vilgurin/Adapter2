import database.DataBase;
import database.Authorization;
import database.ReportBuilder;

public class MainAdapter{
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization авторизація = new Authorization();
        if (авторизація.авторизуватися(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}