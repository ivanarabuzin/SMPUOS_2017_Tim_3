package com.korisnik.services;

import java.util.List;

import com.korisnik.models.Korisnik;
import com.korisnik.models.KorisnikLogin;

public interface KorisnikService {

	public Korisnik findByKorisnickoIme(String korisnickoIme);

	public Korisnik findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka);

	public Korisnik save(Korisnik korisnik);

	public List<Korisnik> findAll();

	public Korisnik login(KorisnikLogin korisnikLogin);

	public Korisnik aktivacijaKorisnika(Long id);

	public Korisnik deaktivacijaKorisnika(Long id);

	public Korisnik findOne(Long id);
}
