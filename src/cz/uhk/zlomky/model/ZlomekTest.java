package cz.uhk.zlomky.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {

    @Test
    void krat() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(1, 2);
        Zlomek vysledek = a.krat(b);
        assertEquals(3, vysledek.getCitatel(), "Citatel");
        assertEquals(8, vysledek.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void deleno() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(1, 2);
        Zlomek vysledek = a.deleno(b);
        assertEquals(6, vysledek.getCitatel(), "Citatel");
        assertEquals(4, vysledek.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void scitani() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(1, 2);
        Zlomek vysledek = a.scitani(b);
        assertEquals(10, vysledek.getCitatel(), "Citatel");
        assertEquals(8, vysledek.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void odcitani() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(1, 2);
        Zlomek vysledek = a.odcitani(b);
        assertEquals(2, vysledek.getCitatel(), "Citatel");
        assertEquals(8, vysledek.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void zkratit() {
        Zlomek a = new Zlomek(4, 8);
        Zlomek vysledek = a.zkratit();
        assertEquals(1, vysledek.getCitatel(), "Citatel");
        assertEquals(2, vysledek.getJmenovatel(), "Jmenovatel");
    }
}