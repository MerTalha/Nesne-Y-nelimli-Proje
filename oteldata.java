import java.util.Arrays;
import java.util.List;

public class oteldata {
    final int normalHaftaIciIkiFiyat = 100, vipHaftaIciIkiFiyat = 200, normalHaftaSonuIkiFiyat = 120, vipHaftaSonuIkiFiyat = 240, normalHaftaIciDortFiyat = 170, normalHaftaSonuDortFiyat = 200, vipHaftaIciDortFiyat = 350, vipHaftaSonuDortFiyat = 400;
    static int toplamFiyat;
    final String[] gunlerDizi = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};

    private final List<String> gunlerList = Arrays.asList(gunlerDizi);

    static Boolean pazartesi1 = false, sali1 = false, carsamba1 = false, persembe1 = false, cuma1 = false, cumartesi1 = false, pazar1 = false;
    static Boolean pazartesi2 = false, sali2 = false, carsamba2 = false, persembe2 = false, cuma2 = false, cumartesi2 = false, pazar2 = false;
    static Boolean pazartesi3 = false, sali3 = false, carsamba3 = false, persembe3 = false, cuma3 = false, cumartesi3 = false, pazar3 = false;
    static Boolean pazartesi4 = false, sali4 = false, carsamba4 = false, persembe4 = false, cuma4 = false, cumartesi4 = false, pazar4 = false;
    static Boolean pazartesiVip1 = false, saliVip1 = false, carsambaVip1 = false, persembeVip1 = false, cumaVip1 = false, cumartesiVip1 = false, pazarVip1 = false;
    static Boolean pazartesiVip2 = false, saliVip2 = false, carsambaVip2 = false, persembeVip2 = false, cumaVip2 = false, cumartesiVip2 = false, pazarVip2 = false;

    public static int getToplamFiyat() {
        return toplamFiyat;
    }

    public int getNormalHaftaIciIkiFiyat() {
        return normalHaftaIciIkiFiyat;
    }

    public int getNormalHaftaSonuIkiFiyat() {
        return normalHaftaSonuIkiFiyat;
    }

    public int getVipHaftaIciIkiFiyat() {
        return vipHaftaIciIkiFiyat;
    }

    public int getVipHaftaSonuIkiFiyat() {
        return vipHaftaSonuIkiFiyat;
    }

    public List<String> getGunlerList() {
        return gunlerList;
    }

    public int getNormalHaftaIciDortFiyat() {
        return normalHaftaIciDortFiyat;
    }

    public int getNormalHaftaSonuDortFiyat() {
        return normalHaftaSonuDortFiyat;
    }

    public int getVipHaftaIciDortFiyat() {
        return vipHaftaIciDortFiyat;
    }

    public int getVipHaftaSonuDortFiyat() {
        return vipHaftaSonuDortFiyat;
    }

    public static void reservation(String gun, int odaNo) {

        oteldata oteldata = new oteldata();

        if (odaNo == 1) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazartesi1) {
                    pazartesi1 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!sali1) {
                    sali1 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!carsamba1) {
                    carsamba1 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!persembe1) {
                    persembe1 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cuma1) {
                    cuma1 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumartesi1) {
                    cumartesi1 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazar1) {
                    pazar1 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuIkiFiyat();
                }

            }
        }
        if (odaNo == 2) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazartesi2) {
                    pazartesi2 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!sali2) {
                    sali2 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!carsamba2) {
                    carsamba2 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!persembe2) {
                    persembe2 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cuma2) {
                    cuma2 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumartesi2) {
                    cumartesi2 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazar2) {
                    pazar2 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuIkiFiyat();
                }
            }
        }
        if (odaNo == 3) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi3) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazartesi3) {
                    pazartesi3 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali3) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!sali3) {
                    sali3 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba3) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!carsamba3) {
                    carsamba3 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe3) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!persembe3) {
                    persembe3 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma3) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cuma3) {
                    cuma3 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi3) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumartesi3) {
                    cumartesi3 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar3) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazar3) {
                    pazar3 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuDortFiyat();
                }

            }
        }
        if (odaNo == 4) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi4) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazartesi4) {
                    pazartesi4 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali4) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!sali4) {
                    sali4 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba4) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!carsamba4) {
                    carsamba4 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe4) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!persembe4) {
                    persembe4 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma4) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cuma4) {
                    cuma4 = true;
                    toplamFiyat += oteldata.getNormalHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi4) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumartesi4) {
                    cumartesi4 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar4) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazar4) {
                    pazar4 = true;
                    toplamFiyat += oteldata.getNormalHaftaSonuDortFiyat();
                }

            }
        }
        if (odaNo == 5) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesiVip1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazartesiVip1) {
                    pazartesiVip1 = true;
                    toplamFiyat += oteldata.getVipHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (saliVip1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!saliVip1) {
                    saliVip1 = true;
                    toplamFiyat += oteldata.getVipHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsambaVip1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!carsambaVip1) {
                    carsambaVip1 = true;
                    toplamFiyat += oteldata.getVipHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembeVip1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!persembeVip1) {
                    persembeVip1 = true;
                    toplamFiyat += oteldata.getVipHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cumaVip1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumaVip1) {
                    cumaVip1 = true;
                    toplamFiyat += oteldata.getVipHaftaIciIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesiVip1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumartesiVip1) {
                    cumartesiVip1 = true;
                    toplamFiyat += oteldata.getVipHaftaSonuIkiFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazarVip1) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazarVip1) {
                    pazarVip1 = true;
                    toplamFiyat += oteldata.getVipHaftaSonuIkiFiyat();
                }

            }
        }
        if (odaNo == 6) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesiVip2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazartesiVip2) {
                    pazartesiVip2 = true;
                    toplamFiyat += oteldata.getVipHaftaIciDortFiyat();
                }


            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (saliVip2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!saliVip2) {
                    saliVip2 = true;
                    toplamFiyat += oteldata.getVipHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsambaVip2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!carsambaVip2) {
                    carsambaVip2 = true;
                    toplamFiyat += oteldata.getVipHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembeVip2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!persembeVip2) {
                    persembeVip2 = true;
                    toplamFiyat += oteldata.getVipHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cumaVip2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumaVip2) {
                    cumaVip2 = true;
                    toplamFiyat += oteldata.getVipHaftaIciDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesiVip2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!cumartesiVip2) {
                    cumartesiVip2 = true;
                    toplamFiyat += oteldata.getVipHaftaSonuDortFiyat();
                }

            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazarVip2) {
                    System.out.println("Bugun coktan rezerve edilmis. Lutfen baska bir gun ya da odaya bakiniz.");
                } else if (!pazarVip2) {
                    pazarVip2 = true;
                    toplamFiyat += oteldata.getVipHaftaSonuDortFiyat();
                }

            }
        }


    }

    public static void rezervasyonIptal(String gun, int odaNo) {
        oteldata oteldata = new oteldata();

        if (odaNo == 1) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi1 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!pazartesi1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali1) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    sali1 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!sali1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba1) {
                    System.out.println("Rezervasyon iptal edildi.");
                    carsamba1 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!carsamba1) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe1) {
                    System.out.println("Rezervasyon iptal edildi.");
                    persembe1 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!persembe1) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma1 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!cuma1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi1 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuIkiFiyat();
                } else if (!cumartesi1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar1 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuIkiFiyat();
                } else if (!pazar1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            }
        } else if (odaNo == 2) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi2 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!pazartesi2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali2) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    sali2 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!sali2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba2) {
                    System.out.println("Rezervasyon iptal edildi.");
                    carsamba2 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!carsamba2) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe2) {
                    System.out.println("Rezervasyon iptal edildi.");
                    persembe2 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!persembe2) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma2 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciIkiFiyat();
                } else if (!cuma2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi2 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuIkiFiyat();
                } else if (!cumartesi2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar2 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuIkiFiyat();
                } else if (!pazar2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            }
        } else if (odaNo == 3) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi3 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!pazartesi3) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali3) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    sali3 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!sali3) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba3) {
                    System.out.println("Rezervasyon iptal edildi.");
                    carsamba3 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!carsamba3) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe3) {
                    System.out.println("Rezervasyon iptal edildi.");
                    persembe3 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!persembe3) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma3 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!cuma3) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi3 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuDortFiyat();
                } else if (!cumartesi3) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar3 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuDortFiyat();
                } else if (!pazar3) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            }
        } else if (odaNo == 4) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesi4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi4 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!pazartesi4) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (sali4) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    sali4 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!sali4) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsamba4) {
                    System.out.println("Rezervasyon iptal edildi.");
                    carsamba4 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!carsamba4) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembe4) {
                    System.out.println("Rezervasyon iptal edildi.");
                    persembe4 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!persembe4) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cuma4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma4 = false;
                    toplamFiyat -= oteldata.getNormalHaftaIciDortFiyat();
                } else if (!cuma4) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesi4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi4 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuDortFiyat();
                } else if (!cumartesi4) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazar4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar4 = false;
                    toplamFiyat -= oteldata.getNormalHaftaSonuDortFiyat();
                } else if (!pazar4) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            }
        } else if (odaNo == 5) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesiVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesiVip1 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciIkiFiyat();
                } else if (!pazartesiVip1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (saliVip1) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    saliVip1 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciIkiFiyat();
                } else if (!saliVip1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsambaVip1) {
                    System.out.println("Rezervasyon iptal edildi.");
                    carsambaVip1 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciIkiFiyat();
                } else if (!carsambaVip1) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembeVip1) {
                    System.out.println("Rezervasyon iptal edildi.");
                    persembeVip1 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciIkiFiyat();
                } else if (!persembeVip1) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cumaVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumaVip1 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciIkiFiyat();
                } else if (!cumaVip1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesiVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesiVip1 = false;
                    toplamFiyat -= oteldata.getVipHaftaSonuIkiFiyat();
                } else if (!cumartesiVip1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazarVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazarVip1 = false;
                    toplamFiyat -= oteldata.getVipHaftaSonuIkiFiyat();
                } else if (!pazarVip1) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            }
        } else if (odaNo == 6) {
            if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(0))) {
                if (pazartesiVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesiVip2 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciDortFiyat();
                } else if (!pazartesiVip2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(1))) {
                if (saliVip2) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    saliVip2 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciDortFiyat();
                } else if (!saliVip2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(2))) {
                if (carsambaVip2) {
                    System.out.println("Rezervasyon iptal edildi.");
                    carsambaVip2 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciDortFiyat();
                } else if (!carsambaVip2) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(3))) {
                if (persembeVip2) {
                    System.out.println("Rezervasyon iptal edildi.");
                    persembeVip2 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciDortFiyat();
                } else if (!persembeVip2) {
                    System.out.println("Bugün zaten rezerve edilmis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(4))) {
                if (cumaVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumaVip2 = false;
                    toplamFiyat -= oteldata.getVipHaftaIciDortFiyat();
                } else if (!cumaVip2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(5))) {
                if (cumartesiVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesiVip2 = false;
                    toplamFiyat -= oteldata.getVipHaftaSonuDortFiyat();
                } else if (!cumartesiVip2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            } else if (gun.equalsIgnoreCase(oteldata.getGunlerList().get(6))) {
                if (pazarVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazarVip2 = false;
                    toplamFiyat -= oteldata.getVipHaftaSonuDortFiyat();
                } else if (!pazarVip2) {
                    System.out.println("Bugün zaten rezerve edilmemis.");
                }
            }
        }
    }
}
