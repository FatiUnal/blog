package com.example.blogv1.dto;

public class LandRequestDto extends PostRequestDto{

    private int brutMetrekare;
    private int netMetrekare;
    private String imarDurumu;
    private String adaParsel;
    private String tapuDurumu;

    public LandRequestDto(String sehir,String ilce,String title, String content, String type, int brutMetrekare, int netMetrekare, String imarDurumu, String adaParsel, String tapuDurumu) {
        super(title, content,type,sehir,ilce);
        this.brutMetrekare = brutMetrekare;
        this.netMetrekare = netMetrekare;
        this.imarDurumu = imarDurumu;
        this.adaParsel = adaParsel;
        this.tapuDurumu = tapuDurumu;
    }

    public int getBrutMetrekare() {
        return brutMetrekare;
    }

    public int getNetMetrekare() {
        return netMetrekare;
    }

    public String getImarDurumu() {
        return imarDurumu;
    }

    public String getAdaParsel() {
        return adaParsel;
    }

    public String getTapuDurumu() {
        return tapuDurumu;
    }
}
