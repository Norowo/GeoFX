package dad.geofx.model;

import java.util.List;

public class LocationModel {
	private String ip;
    private String hostname;
    private String type;
    private String continentCode;
    private String continentName;
    private String countryCode;
    private String countryName;
    private String regionCode;
    private String regionName;
    private String city;
    private String zip;
    private double latitude;
    private double longitude;
    private Location location;
    private TimeZone timeZone;
    private Currency currency;
    private Connection connection;
    private Security security;

    // Getters and setters

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public static class Location {
        private int geonameId;
        private String capital;
        private List<Language> languages;
        private String countryFlag;
        private String countryFlagEmoji;
        private String countryFlagEmojiUnicode;
        private String callingCode;
        private boolean isEu;

        // Getters and setters

        public int getGeonameId() {
            return geonameId;
        }

        public void setGeonameId(int geonameId) {
            this.geonameId = geonameId;
        }

        public String getCapital() {
            return capital;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

        public List<Language> getLanguages() {
            return languages;
        }

        public void setLanguages(List<Language> languages) {
            this.languages = languages;
        }

        public String getCountryFlag() {
            return countryFlag;
        }

        public void setCountryFlag(String countryFlag) {
            this.countryFlag = countryFlag;
        }

        public String getCountryFlagEmoji() {
            return countryFlagEmoji;
        }

        public void setCountryFlagEmoji(String countryFlagEmoji) {
            this.countryFlagEmoji = countryFlagEmoji;
        }

        public String getCountryFlagEmojiUnicode() {
            return countryFlagEmojiUnicode;
        }

        public void setCountryFlagEmojiUnicode(String countryFlagEmojiUnicode) {
            this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
        }

        public String getCallingCode() {
            return callingCode;
        }

        public void setCallingCode(String callingCode) {
            this.callingCode = callingCode;
        }

        public boolean isEu() {
            return isEu;
        }

        public void setEu(boolean eu) {
            isEu = eu;
        }
    }

    public static class Language {
        private String code;
        private String name;
        private String nativeName;

        // Getters and setters

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNativeName() {
            return nativeName;
        }

        public void setNativeName(String nativeName) {
            this.nativeName = nativeName;
        }
    }

    public static class TimeZone {
        private String id;
        private String currentTime;
        private int gmtOffset;
        private String code;
        private boolean isDaylightSaving;

        // Getters and setters

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCurrentTime() {
            return currentTime;
        }

        public void setCurrentTime(String currentTime) {
            this.currentTime = currentTime;
        }

        public int getGmtOffset() {
            return gmtOffset;
        }

        public void setGmtOffset(int gmtOffset) {
            this.gmtOffset = gmtOffset;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public boolean isDaylightSaving() {
            return isDaylightSaving;
        }

        public void setDaylightSaving(boolean daylightSaving) {
            isDaylightSaving = daylightSaving;
        }
    }

    public static class Currency {
        private String code;
        private String name;
        private String plural;
        private String symbol;
        private String symbolNative;

        // Getters and setters

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlural() {
            return plural;
        }

        public void setPlural(String plural) {
            this.plural = plural;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbolNative() {
            return symbolNative;
        }

        public void setSymbolNative(String symbolNative) {
            this.symbolNative = symbolNative;
        }
    }

    public static class Connection {
        private int asn;
        private String isp;

        // Getters and setters

        public int getAsn() {
            return asn;
        }

        public void setAsn(int asn) {
            this.asn = asn;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }
    }

    public static class Security {
        private boolean isProxy;
        private String proxyType;
        private boolean isCrawler;
        private String crawlerName;
        private String crawlerType;
        private boolean isTor;
        private String threatLevel;
        private List<String> threatTypes;

        // Getters and setters

        public boolean isProxy() {
            return isProxy;
        }

        public void setProxy(boolean proxy) {
            isProxy = proxy;
        }

        public String getProxyType() {
            return proxyType;
        }

        public void setProxyType(String proxyType) {
            this.proxyType = proxyType;
        }

        public boolean isCrawler() {
            return isCrawler;
        }

        public void setCrawler(boolean crawler) {
            isCrawler = crawler;
        }

        public String getCrawlerName() {
            return crawlerName;
        }

        public void setCrawlerName(String crawlerName) {
            this.crawlerName = crawlerName;
        }

        public String getCrawlerType() {
            return crawlerType;
        }

        public void setCrawlerType(String crawlerType) {
            this.crawlerType = crawlerType;
        }

        public boolean isTor() {
            return isTor;
        }

        public void setTor(boolean tor) {
            isTor = tor;
        }

        public String getThreatLevel() {
            return threatLevel;
        }

        public void setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
        }

        public List<String> getThreatTypes() {
            return threatTypes;
        }

        public void setThreatTypes(List<String> threatTypes) {
            this.threatTypes = threatTypes;
        }
    }
}
