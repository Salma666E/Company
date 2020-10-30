/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_project;

import java.util.Objects;

/**
 *
 * @author باسم
 */
public class emp_company {
    private int id;
    private String name;
    private String address;
    private int rank;
    private int hoursworked;
    private int overtime;
    
    
    public emp_company(int id, String name, String address, int rank, int hoursworked, int overtime) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rank = rank;
        this.hoursworked = hoursworked;
        this.overtime = overtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final emp_company other = (emp_company) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.rank != other.rank) {
            return false;
        }
        if (this.hoursworked != other.hoursworked) {
            return false;
        }
        if (this.overtime != other.overtime) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Employee_Data : " + "name : " + name 
                + " , id : " + id 
                + ", address=" + address 
                + ", rank=" + rank 
                + ", hoursworked=" + hoursworked + ", overtime=" + overtime ;
    } 
    
}
