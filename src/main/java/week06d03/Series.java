package week06d03;

import java.util.List;

public class Series {

    public SeriesType calculateSeriesType(List<Integer> series){
        SeriesType seriesType = null;
        validator(series);
        if (series.get(0) < series.get(1)){
            seriesType = SeriesType.ASCENDING;
        } else {
            seriesType = SeriesType.DESCENDING;
        }
        for (int i = 1; i < series.size()-1; i++) {
            if ((seriesType == SeriesType.ASCENDING && series.get(i) > series.get(i+1)) ||
                    (seriesType == SeriesType.DESCENDING && series.get(i) < series.get(i+1)))
            {
                seriesType = SeriesType.MIXED;
            }
        }
        return seriesType;
    }

    private void validator(List<Integer> series){
        if (series == null || series.size() < 2){
            throw new IllegalArgumentException("The series must contain more than one number!");
        }
    }

}
