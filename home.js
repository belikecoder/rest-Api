import React from 'react';
import {BrowserRouter as Router,Link,Route,Routes} from 'react-router-dom';
import PatientRegistration from './PatientForm';
import GetForm from './GetForm';
import UpdateForm from './UpdateForm';
import Deleteform from './Deleteform';
import './dum.css';

function Dum(){
    return (
        <div className='App'>
                 <Router>
                    <div class='nav'>
                        <h1>KSV Hospitals</h1>
                        <div class='nav-link'>
                    <Link to='/'><button><b>HOME</b></button></Link>
                    <Link to='/UpdateForm'><button><b>UPDATE</b></button></Link>
                    <Link to='/GetForm'><button><b>VIEW</b></button></Link>
                    <Link to='/Deleteform'><button><b>DELETE</b></button></Link>
                    </div>
                    </div>
                    <br></br>
                <Routes>
                    
                
                <Route path='/' element={<PatientRegistration/>}/>
                <Route path='/GetForm' element={<GetForm/>}/>
                <Route path='/UpdateForm' element={<UpdateForm/>}/>
                <Route path='/Deleteform' element={<Deleteform/>}/>

                </Routes>
                </Router>

        </div>
    )
}

export default Dum;