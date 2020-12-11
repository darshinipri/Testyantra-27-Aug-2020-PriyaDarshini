import React ,{useState } from 'react'
import axios from 'axios'

const PendingApplications = (props)=>{

    const [applns,setApplns] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/lms/employee/')
        return () => {
            cleanup
        }
    }, [])



    return(
        <div>
        </div>
    )
}

export default PendingApplications;