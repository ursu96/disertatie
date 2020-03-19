package ursu.disertatie.Services;

import org.springframework.stereotype.Service;
import ursu.disertatie.Models.Summary;

import java.util.ArrayList;
import java.util.List;

@Service
public class SummaryService {

    public List<String> getSummary (){
        List<String> todaySummaryList = new ArrayList();
        for (int i=0; i < 7 ; i++){
            todaySummaryList.add(String.valueOf(i));
        }
        return  todaySummaryList;
    }

}
