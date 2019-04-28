package com.srisai.kotlin.dataprocessing

import java.io.File

fun main(args: Array<String>) {

    var aadharData = ArrayList<AadharInfo>()
    var count: Int = 0

    File("/Users/jayakar/Desktop/Backup/abc.csv").forEachLine {
        if(count == 0){
            count++
            return@forEachLine
        }
        var tokens = it.split(",")
        var aadharInfo = AadharInfo(
                registrar = tokens[0],
                enrolmentAgency = tokens[1],
                state = tokens[2],
                district = tokens[3],
                subDistrict = tokens[4],
                pinCode = if(tokens[5].equals("Others")) "00000".toInt() else tokens[5].toInt(),
                gender = tokens[6],
                age = tokens[7].toInt(),
                aadhaarGenerated = tokens[8],
                enrolmentRejected = tokens[9],
                residentsProvidingEmail = tokens[10],
                residentsProvidingMobileNumber = tokens[11]
        )

        aadharData.add(aadharInfo)
    }

    println("Total records $count")

//    aadharData.forEach { println(it) }
    val aaList: List<String> = aadharData.filter { it.state.equals("Karnataka") }.map { it.enrolmentAgency }.distinct()
    println(aaList.size)

    // Total Number of approved applicants.

    val totalNofApplicants = aadharData.filter { it.aadhaarGenerated.equals("1") }.count()
    println("Total Number of approved applicants : $totalNofApplicants")

    // Total Number of rejected applicants.

    val totalNofRejectedApplicants = aadharData.filter { it.aadhaarGenerated.equals("0") }.count()
    println("Total Number of approved applicants : $totalNofRejectedApplicants")


    //Total Number of rejected applicants in AP

    val totalNofRejectedApplicantsInAP = aadharData.filter { it.aadhaarGenerated.equals("0") }.filter { it.state.equals("Andhra Pradesh") }.count()
    println("Total Number of rejected applicants in AP : $totalNofRejectedApplicantsInAP")

    // State wise count

    var stateWiseCount = aadharData.filter { it.state.equals("Andhra Pradesh") }.groupingBy { it.state }.eachCount()
    println("Statewise applicants : $stateWiseCount")

    // Total Male applicants

    val totalMaleApplicants = aadharData.filter { it.gender.equals("M") }.count()
    println("Total number of Male applicants $totalMaleApplicants")

    // Total female rejected applicants

    val totalFemaleRejected = aadharData.filter { it.gender.equals("F") }.filter { it.enrolmentRejected.equals("1") }.count()
    println("Total Number of Female rejected applicants $totalFemaleRejected")

    // Total Number of approved applicants in AP.

    val totalNofApplicantsInAP = aadharData.filter { it.aadhaarGenerated.equals("1") }.filter { it.state.equals("Andhra Pradesh") }.count()
    println("Total Number of approved applicants in AP : $totalNofApplicantsInAP")

    // Total Number of approved applicants in AP's Nellore Dt.

    val totalNofApplicantsInAPNellore = aadharData.filter { it.aadhaarGenerated.equals("1") }.filter { it.state.equals("Andhra Pradesh") }.filter { it.district.equals("Nellore") }.count()
    println("Total Number of approved applicants in AP's Nellore : $totalNofApplicantsInAPNellore")

    // Highest no of female applicants by state

    val highestFemaleByState = aadharData.filter { it.gender.equals("F") }.groupingBy { it.state }.eachCount()
    println("Highest number of female applicants ${highestFemaleByState.maxBy { it.value }}")
    println("Lowest number of female applicants ${highestFemaleByState.minBy { it.value }}")
    println("Number of female applicants State wise - $highestFemaleByState")

    // No of applicants who are under age 10

    val ageLessThan10:Int = aadharData.filter { it.age < 10 }.count()
    println("No of applicants who are under age 10 - $ageLessThan10")

    // No of applicants who age is greater than 60

    val age60AboveListByState = aadharData.filter { it.age > 60 }.groupingBy { it.state }.eachCount()
    println("Applicant's Age above 60 by each state ${age60AboveListByState}")
    println("Highest Applicant's Age above 60 by each state ${age60AboveListByState.maxBy { it.value }}")
    println("Lowest Applicant's Age above 60 by each state ${age60AboveListByState.minBy { it.value }}")

    val statesSortBy = aadharData.sortedBy { it.state }.groupingBy { it.state }.eachCount()
    println("States SortBy $statesSortBy")

    val pinCodesOrderBy = aadharData.sortedBy { it.state }.groupingBy { it.pinCode }.eachCount()
    println("All States Pin codes Order by and Group by -- ${pinCodesOrderBy.maxBy { it.value }}")

    // Total number of applicants count by state
    val bb:Int = aadharData.filter { it.state.equals("Andhra Pradesh") }.takeIf { it.isNotEmpty() }!!.count()
    println(bb)
}


data class AadharInfo(var registrar: String,
                      var enrolmentAgency: String,
                      var state: String,
                      var district: String,
                      var subDistrict: String,
                      var pinCode: Int,
                      var gender: String,
                      var age: Int,
                      var aadhaarGenerated: String,
                      var enrolmentRejected: String,
                      var residentsProvidingEmail: String,
                      var residentsProvidingMobileNumber: String) {

}

// used below collectiob methods
// foe