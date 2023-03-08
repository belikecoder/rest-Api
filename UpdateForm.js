import * as React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import { useState} from 'react';
import axios from 'axios';
// import 'bootstrap/dist/css/bootstrap.min.css';
import './patient.css';

import './patient.css';
export default function UpdateForm() {
    const [id, setId] = useState('');
    const [patientName, setPatientName] = useState("");
    const [diseaseName, setDiseaseName] = useState("");
    const [wardNo, setWardNo] = useState("");
    const [dateOfBirth, setDateOfBirth] = useState("");
    const [age, setAge] = useState("");
    const [phoneNumber, setPhoneNumber] = useState("");
    const [address, setAddress] = useState("");
    const [gender, setGender] = useState("");
    async function save(event) {
        event.preventDefault();
        try {
            await axios.put("http://localhost:8080/patients/put",

                { id:id,
                    patientName:patientName,
                    diseaseName:diseaseName,
                    wardNo:wardNo,
                    dateOfBirth:dateOfBirth,
                    age:age,
                    phoneNumber:phoneNumber,
                    address : address,
                    gender:gender

                });
            alert("Patient Updation Successfully Completed");
            setId("");
            setPatientName("");
            setDiseaseName("");
            setAddress("");
            setAge("");
            setDateOfBirth("");
            setPhoneNumber("");
            setGender("");
            setWardNo("");


        }
        catch (err) {
            alert("User Updation Failed");
        }
    }

    return (
      <div class="container mt-4"  style={{ display: 'block', 
      width: 700, 
      padding: 30 }}>
        <center><h1>Update  Details of Patient</h1></center>
      <form>
      <div class="form-group">
      <label><span>Id</span></label>
      <center><input type="text" class="form-control" placeholder='Enter ID Number'value={id} onChange={(e) => setId(e.target.value)}/></center>
          <br></br>
          <br></br>
          <label><span>PatientName</span></label>
          <input type="text" class="form-control" placeholder="Enter PatientName"
           value={patientName}
          onChange={(event) =>
            {
              setPatientName(event.target.value);      
            }}
          />
      </div>
      <br></br>
      <div class="form-group">
          <label><span>DiseaseName</span></label>
          <input type="text" class="form-control" placeholder="Enter DiseaseName"
           value={diseaseName}
          onChange={(event) =>
            {
              setDiseaseName(event.target.value);      
            }}
          />
      </div>
      <br></br>
      <div class="form-group">
          <label><span>Address</span></label>
          <input type="text" class="form-control" placeholder="Enter Address"
           value={address}
           onChange={(event) =>
             {
              setAddress(event.target.value);      
             }}
          />
      </div>
      <br></br>
      <div class="form-group">
          <label><span>Age</span></label>
          <input type="text" class="form-control" placeholder="Enter age"
           value={age}
           onChange={(event) =>
             {
              setAge(event.target.value);      
             }}
          />
      </div>
      <br></br>
      <div class="form-group">
          <label><span>DateOfBirth</span></label>
          <input type="text" class="form-control" placeholder="Enter DOB"
          value={dateOfBirth}
          onChange={(event) =>
            {
              setDateOfBirth(event.target.value);      
            }}
         />
      </div>
      <br></br>
      <div class="form-group">
          <label><span>WardNo</span></label>
          <input type="text" class="form-control" placeholder="Enter WardNo"
          value={wardNo}
          onChange={(event) =>
            {
              setWardNo(event.target.value);      
            }}
         />
      </div>
      <br></br>
      <div class="form-group">
          <label><span>PhoneNumber</span></label>
          <input type="text" class="form-control" placeholder="Enter WardNo"
          value={phoneNumber}
          onChange={(event) =>
            {
              setPhoneNumber(event.target.value);      
            }}
         />
      </div>
      <br></br>
      <div class="form-group">
          <label><span>Gender</span></label>
          <input type="text" class="form-control" placeholder="Enter Gender"
          value={gender}
          onChange={(event) =>
            {
              setGender(event.target.value);      
            }}
         />
      </div>
      <br></br>
     <center> <button class="btn btn-primary mt-4"  onClick={save}>Update</button></center>
      </form>


    </div>
    );
}