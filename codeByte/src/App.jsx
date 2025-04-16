import { Routes, Route, } from 'react-router-dom';
import './App.css';
import Navbar from './component/Navbar';
import Home from './component/Home';

function App() {
  return (
<>
<Home />
<Routes>
        <Route path="/" element={<Navbar />} />
      
</Routes>

</>
 
  );
}

export default App;
