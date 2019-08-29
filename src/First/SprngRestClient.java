package First;
public class SprngRestClient {

    public static void main(String args[]) {
        getMovieTitles("spiderman");
    }

    static void getMovieTitles(String movietitle) {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress("sample.proxy", 8080));
        requestFactory.setProxy(proxy);
        List<String> moviewTitles = new ArrayList<String>();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        int pageNo = 0;
        int totalPages = 100000;
        while (pageNo != totalPages) {
            pageNo = pageNo + 1;
            SearchResult quote = restTemplate.getForObject(
                    "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + movietitle + "&page=" + pageNo,
                    SearchResult.class);
            moviewTitles.addAll(quote.getMovieTitles()
                                     .stream()
                                     .map(title -> title.getTitle())
                                     .collect(Collectors.toList()));
            pageNo = Integer.parseInt(quote.getPage());
            totalPages = Integer.parseInt(quote.getTotal_pages());
        }
        moviewTitles.sort((name1, name2) -> name1.compareTo(name2));
        moviewTitles.forEach(System.out::println);
    }

}