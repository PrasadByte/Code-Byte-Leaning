import { Routes, Route, } from 'react-router-dom';
import './App.css';

import Home from './component/Home';
import AuthForm from './component/AuthForm';


function App() {
  return (
<>
<Home />


<Routes>
   
        <Route path="/register" element={<AuthForm />} />
  
       
      
</Routes>

</>
 
  );
}

export default App;
