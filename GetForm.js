import React from 'react'
import axios from 'axios';
import { useState, useEffect } from "react";
import './getform.css';

const GetForm = () => {
    const [myData, setMyData] = useState([]);
    const [isError, setIsError] = useState("");
    useEffect(() => {
        axios
            .get("http://localhost:8080/patients/get")
            .then((response) => {
                console.log(response.data)
                setMyData(response.data)
            })
            .catch((error) => setIsError(error.message));
    }, []);
    return (
        <>
           <center> <h1 className="head"> View Details of Patient</h1></center>
           <br></br>
           <br></br>
            {isError !== "" && <h2>{isError}</h2>}
              
            <div className="grid">
               
                        <table className="table caption-top">
                            
                                <thead>
                                    <th scope="col">Id</th>
                                    <th scope="col">PatientName</th>
                                    <th scope="col">DiseaseName</th>
                                    <th scope="col">WardNo</th>
                                    <th scope="col">DateOfBirth</th>
                                    <th scope="col">Age</th>
                                    <th scope="col">PhoneNumber</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Gender</th>
                                    
                                </thead>
                               <tbody>
                               {myData.slice(0, 8).map((post)=> {
                                return (
                                <tr key={(post.id)}className="tr">
                                    <td>{post.id}</td>
                                    <td>{post.patientName}</td>
                                    <td>{post.diseaseName}</td>
                                    <td>{post.wardNo}</td>
                                    <td>{post.dateOfBirth}</td>
                                    <td>{post.age}</td>
                                    <td>{post.phoneNumber}</td>
                                    <td>{post.address}</td>
                                    <td>{post.gender}</td>
                                    </tr>
    )
    
})
}
                                    
                                </tbody>
                            
                            </table>
                        
            </div>
        </>
    );
};

export default GetForm;