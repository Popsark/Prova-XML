package com.it.gf.meucci;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        Alunno a1 = new Alunno();
        Alunno a2 = new Alunno();
        Alunno a3 = new Alunno();
        Alunno a4 = new Alunno();
        
        Classe c1 = new Classe();

        c1.aggiungiAlunno(a1);
        c1.aggiungiAlunno(a2);
        c1.aggiungiAlunno(a3);
        c1.aggiungiAlunno(a4);
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("classe.xml"), c1);
        


    }
}
