package ru.mirea.ikbo1319.task07.flyweight;

public class Star {
    @SuppressWarnings("unused")
    private SpectralType spectralType;

    public Star() {
        System.out.println("New star created");
        this.spectralType = SpectralType.G;
    }

    public Star setSpectralType(SpectralType spectralType) {
        this.spectralType = spectralType;
        return this;
    }
}
