package org.faqrobot.text_peng.entity;

import java.util.List;

/**
 * Created by 孟晨 on 2017/10/10.
 */

public class MyBean {
    /**
     * count : 1
     * start : 2
     * total : 545
     * books : [{"rating":{"max":10,"numRaters":361,"average":"9.0","min":0},"subtitle":"","author":["笑笑生"],"pubdate":"2006年","tags":[{"count":186,"name":"古典文学","title":"古典文学"},{"count":181,"name":"金瓶梅","title":"金瓶梅"},{"count":99,"name":"兰陵笑笑生","title":"兰陵笑笑生"},{"count":86,"name":"小说","title":"小说"},{"count":74,"name":"中国文学","title":"中国文学"},{"count":57,"name":"《金瓶梅》","title":"《金瓶梅》"},{"count":45,"name":"文学","title":"文学"},{"count":43,"name":"中国","title":"中国"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s4655223.jpg","binding":"平装线脊","translator":[],"catalog":"","pages":"1019","images":{"small":"https://img3.doubanio.com/spic/s4655223.jpg","large":"https://img3.doubanio.com/lpic/s4655223.jpg","medium":"https://img3.doubanio.com/mpic/s4655223.jpg"},"alt":"https://book.douban.com/subject/1916451/","id":"1916451","publisher":"新加坡南洋出版社","isbn10":"9810553064","isbn13":"9789810553067","title":"金瓶梅","url":"https://api.douban.com/v2/book/1916451","alt_title":"","author_intro":"","summary":"这套《金瓶梅》（上、下册，约1240印刷页）是全球第一部简体、双版本、带200原图（其中30多幅春宫图也全部保留）、不做任何删节处理的版本。是目前海内外各种版本中内容最全的版本。\n它以北京大学图书馆藏善本影印本为蓝本制作的。包括拥有最充分原始信息、最具可读性的\u201c崇祯本\u201d全部内容（该版本曾面向中国高级领导干部、学者和大型图书馆少量印制），并附录万历\u201c词话本\u201d中和\u201c崇祯本\u201d内容不同的部分（将\u201c词话本\u201d中与\u201c崇祯本\u201d差别较大的第一回前半部分，第五十三、五十四回，以及词话本特有，而崇祯本所无的\u201c欣欣自序\u201d、\u201c廿公跋\u201d、\u201c词曰\u201d以及\u201c四贪词\u201d，也一并附上）使得读者花一套书的钱，同时可得两大主要版本的内容。\n崇祯本的200幅精美插图,虽然有\u201c春宫色彩\u201d，也全以每图一页予以保留；崇祯本原有珍贵的眉批和旁评以双排小字体全部插入正文里（该版本现在市面上仅有一套齐鲁版的繁体竖排本，则是将眉批放在页眉位置，使读者不知批点何处。新加坡一些拥有繁体竖排本的读者，又购买该简体版本，主要是看中了这一处理），可起导读作用。并对原本中的异体字进行认真查对和部分替代，给今日读者的阅读必将带来不少方便。\n《金瓶梅》的传世版本很多，主要有词话本、崇祯本和在崇祯本基础上改写而成的\u201c第一奇书\u201d本（中华书局的《会评会校本金瓶梅》以此版本为主体，台湾也出过不少该版本）。\n\u201c崇祯本\u201d可读性较强，是学术界公认的。百年学术争议的课题即：哪本保留了最充分的原始信息，即何者最\u201c正宗\u201d？ 长期以来，学术界普遍认为\u201c词话本\u201d是正宗传本，认为\u201c崇祯本\u201d是在\u201c词话本\u201d基础上改写而成的版本（齐鲁书社出版的繁体竖排本的前言，是由吉林大学知名金学专家王汝梅教授所写，是这一观点的代表性看法）。\n该书主编董玉振博士在细研三大版本基础上，发现了极为确凿的证据，并配合严密的逻辑推演，得出结论：\u201c崇祯本才是《金瓶梅》的真正正宗传本\u201d；否定了万历\u201c词话本\u201d和崇祯本是\u201c父子关系\u201d的传统认识。同时，董博士相当有把握地认为：在万历\u201c词话本\u201d前，曾有过更早的版本，而\u201c崇祯本\u201d就是该版本的唯一传本；有关的分析写入该《金瓶梅》的\u201c前言\u201d中。到目前为止，还没有学者对这一准确的论证提出质疑。董玉振博士所写的前言，引起新加坡本地学者购买该书的极大兴趣。\n董玉振获得清华大学工学博士学位，在新加坡被誉为毛泽东研究专家，他本人及其著作《巨人的背影\u2014\u2014为毛泽东辩护及当代中国问题省思》被南洋媒体广泛报道，并受邀在新加坡、马来西亚进行多场大型演讲。","price":"466"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":361,"average":"9.0","min":0}
         * subtitle :
         * author : ["笑笑生"]
         * pubdate : 2006年
         * tags : [{"count":186,"name":"古典文学","title":"古典文学"},{"count":181,"name":"金瓶梅","title":"金瓶梅"},{"count":99,"name":"兰陵笑笑生","title":"兰陵笑笑生"},{"count":86,"name":"小说","title":"小说"},{"count":74,"name":"中国文学","title":"中国文学"},{"count":57,"name":"《金瓶梅》","title":"《金瓶梅》"},{"count":45,"name":"文学","title":"文学"},{"count":43,"name":"中国","title":"中国"}]
         * origin_title :
         * image : https://img3.doubanio.com/mpic/s4655223.jpg
         * binding : 平装线脊
         * translator : []
         * catalog :
         * pages : 1019
         * images : {"small":"https://img3.doubanio.com/spic/s4655223.jpg","large":"https://img3.doubanio.com/lpic/s4655223.jpg","medium":"https://img3.doubanio.com/mpic/s4655223.jpg"}
         * alt : https://book.douban.com/subject/1916451/
         * id : 1916451
         * publisher : 新加坡南洋出版社
         * isbn10 : 9810553064
         * isbn13 : 9789810553067
         * title : 金瓶梅
         * url : https://api.douban.com/v2/book/1916451
         * alt_title :
         * author_intro :
         * summary : 这套《金瓶梅》（上、下册，约1240印刷页）是全球第一部简体、双版本、带200原图（其中30多幅春宫图也全部保留）、不做任何删节处理的版本。是目前海内外各种版本中内容最全的版本。
         它以北京大学图书馆藏善本影印本为蓝本制作的。包括拥有最充分原始信息、最具可读性的“崇祯本”全部内容（该版本曾面向中国高级领导干部、学者和大型图书馆少量印制），并附录万历“词话本”中和“崇祯本”内容不同的部分（将“词话本”中与“崇祯本”差别较大的第一回前半部分，第五十三、五十四回，以及词话本特有，而崇祯本所无的“欣欣自序”、“廿公跋”、“词曰”以及“四贪词”，也一并附上）使得读者花一套书的钱，同时可得两大主要版本的内容。
         崇祯本的200幅精美插图,虽然有“春宫色彩”，也全以每图一页予以保留；崇祯本原有珍贵的眉批和旁评以双排小字体全部插入正文里（该版本现在市面上仅有一套齐鲁版的繁体竖排本，则是将眉批放在页眉位置，使读者不知批点何处。新加坡一些拥有繁体竖排本的读者，又购买该简体版本，主要是看中了这一处理），可起导读作用。并对原本中的异体字进行认真查对和部分替代，给今日读者的阅读必将带来不少方便。
         《金瓶梅》的传世版本很多，主要有词话本、崇祯本和在崇祯本基础上改写而成的“第一奇书”本（中华书局的《会评会校本金瓶梅》以此版本为主体，台湾也出过不少该版本）。
         “崇祯本”可读性较强，是学术界公认的。百年学术争议的课题即：哪本保留了最充分的原始信息，即何者最“正宗”？ 长期以来，学术界普遍认为“词话本”是正宗传本，认为“崇祯本”是在“词话本”基础上改写而成的版本（齐鲁书社出版的繁体竖排本的前言，是由吉林大学知名金学专家王汝梅教授所写，是这一观点的代表性看法）。
         该书主编董玉振博士在细研三大版本基础上，发现了极为确凿的证据，并配合严密的逻辑推演，得出结论：“崇祯本才是《金瓶梅》的真正正宗传本”；否定了万历“词话本”和崇祯本是“父子关系”的传统认识。同时，董博士相当有把握地认为：在万历“词话本”前，曾有过更早的版本，而“崇祯本”就是该版本的唯一传本；有关的分析写入该《金瓶梅》的“前言”中。到目前为止，还没有学者对这一准确的论证提出质疑。董玉振博士所写的前言，引起新加坡本地学者购买该书的极大兴趣。
         董玉振获得清华大学工学博士学位，在新加坡被誉为毛泽东研究专家，他本人及其著作《巨人的背影——为毛泽东辩护及当代中国问题省思》被南洋媒体广泛报道，并受邀在新加坡、马来西亚进行多场大型演讲。
         * price : 466
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String origin_title;
        private String image;
        private String binding;
        private String catalog;
        private String pages;
        private ImagesBean images;
        private String alt;
        private String id;
        private String publisher;
        private String isbn10;
        private String isbn13;
        private String title;
        private String url;
        private String alt_title;
        private String author_intro;
        private String summary;
        private String price;
        private List<String> author;
        private List<TagsBean> tags;
        private List<?> translator;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getIsbn13() {
            return isbn13;
        }

        public void setIsbn13(String isbn13) {
            this.isbn13 = isbn13;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getTranslator() {
            return translator;
        }

        public void setTranslator(List<?> translator) {
            this.translator = translator;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 361
             * average : 9.0
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/spic/s4655223.jpg
             * large : https://img3.doubanio.com/lpic/s4655223.jpg
             * medium : https://img3.doubanio.com/mpic/s4655223.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class TagsBean {
            /**
             * count : 186
             * name : 古典文学
             * title : 古典文学
             */

            private int count;
            private String name;
            private String title;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
