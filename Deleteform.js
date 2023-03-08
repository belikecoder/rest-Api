import React from 'react';
import axios from 'axios';
import { useState} from 'react';


function Deleteform() {
    const [id, setId] = useState();
    const [error, setError] = useState('');
    function del() {
        // useEffect(() => {
        axios
            .delete('http://localhost:8080/patients/del?id=' + id)
            .then((response) => {
                console.log(response.data);
                
            })
            .catch((error) => setError(error.message));
        alert("User Deleted");
    }
    return (
        <>  <center>
            <h2>Delete  Details of Patient</h2>
            <br></br>
            <br></br>
            <div>
            <div class="container"  style={{ display: 'block', 
        width: 350, 
        padding: 30 }}>
                <input type="text" class="form-control" placeholder='Enter ID Number' value={id} onChange={(e) => setId(e.target.value)}>

                </input>
            </div>
            </div>
<br></br>
            <button type="submit" class="btn btn-primary" onClick
                ={del}>Submit</button>
                </center>
          
            <h2>
                {error}
            </h2>
          
        </>
    );
}

export default Deleteform;