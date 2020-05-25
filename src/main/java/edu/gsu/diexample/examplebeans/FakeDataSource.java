package edu.gsu.diexample.examplebeans;

import org.springframework.beans.factory.annotation.Autowired;

public class FakeDataSource {

    private String name, instrument, genre, url;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "name='" + name + '\'' +
                ", instrument='" + instrument + '\'' +
                ", genre='" + genre + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
